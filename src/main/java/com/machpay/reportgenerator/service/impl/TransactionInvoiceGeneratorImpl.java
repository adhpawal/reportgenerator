package com.machpay.reportgenerator.service.impl;

import com.machpay.reportgenerator.dto.TransactionInvoice;
import com.machpay.reportgenerator.dto.TransactionInvoiceTempStorageInfo;
import com.machpay.reportgenerator.service.ReportGeneratorService;
import com.machpay.reportgenerator.service.TransactionInvoiceGenerator;
import com.machpay.reportgenerator.util.FileUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class TransactionInvoiceGeneratorImpl implements TransactionInvoiceGenerator {

    @Override
    public void generateTransactionInvoice(TransactionInvoice transactionInvoice,TransactionInvoiceTempStorageInfo transactionInvoiceTempStorageInfo) {

        FileUtils.createDirectoryIfNotExist(transactionInvoiceTempStorageInfo.getTempBasePath());
        if(transactionInvoice.getSenderState().equalsIgnoreCase("CA") || transactionInvoice.getSenderState().equalsIgnoreCase("NV")){
            transactionInvoiceTempStorageInfo.setTemplateFileName("transaction_invoice");
        }else{
            transactionInvoiceTempStorageInfo.setTemplateFileName("prabhu_transaction_invoice");
        }
        
        // Convert To Html with apache free marker
        convertToHtml(transactionInvoice,transactionInvoiceTempStorageInfo);

        // Convert to PDF and store temp location
        ReportGeneratorService reportGeneratorService = new PdfGeneratorServiceImpl();
        reportGeneratorService.generate(transactionInvoiceTempStorageInfo.getHtmlPath(),transactionInvoiceTempStorageInfo.getPdfPath());

    }

    private void convertToHtml(TransactionInvoice transactionInvoice,TransactionInvoiceTempStorageInfo transactionInvoiceTempStorageInfo){
        Map<String, Object> input = new HashMap<>();
        input.put("transactionInvoice",transactionInvoice);
        TemplateManagerServiceImpl templateManagerServiceImpl = new TemplateManagerServiceImpl();
        templateManagerServiceImpl.processTemplate(transactionInvoiceTempStorageInfo.getTemplateFileName(),transactionInvoiceTempStorageInfo.getTemplateDirectoryPath(),transactionInvoiceTempStorageInfo.getHtmlPath(),input);
    }
}
