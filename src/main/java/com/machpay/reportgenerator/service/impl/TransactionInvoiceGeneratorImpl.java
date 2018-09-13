package com.machpay.reportgenerator.service.impl;

import com.machpay.reportgenerator.dto.TransactionInvoice;
import com.machpay.reportgenerator.dto.TransactionInvoiceTempStorageInfo;
import com.machpay.reportgenerator.service.ReportGeneratorService;
import com.machpay.reportgenerator.service.TransactionInvoiceGenerator;
import com.machpay.reportgenerator.util.FileUtils;
import com.machpay.reportgenerator.util.XhtmlToHtmlConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class TransactionInvoiceGeneratorImpl implements TransactionInvoiceGenerator {

    @Override
    public void generateTransactionInvoice(TransactionInvoice transactionInvoice,TransactionInvoiceTempStorageInfo transactionInvoiceTempStorageInfo) {

        FileUtils.createDirectoryIfNotExist(transactionInvoiceTempStorageInfo.getTempBasePath());
        
        // Convert To Html with apache free marker
        convertToHtml(transactionInvoice,transactionInvoiceTempStorageInfo);

        // Convert To Xhtml with jtidy
        XhtmlToHtmlConverter.convertXHTMLToHTML(transactionInvoiceTempStorageInfo.getHtmlPath(), transactionInvoiceTempStorageInfo.getXhtmlPath());

        // Convert to PDF and store temp location
        ReportGeneratorService reportGeneratorService = new PdfGeneratorServiceImpl();
        reportGeneratorService.generate(transactionInvoiceTempStorageInfo.getXhtmlPath(),transactionInvoiceTempStorageInfo.getPdfPath());

    }

    private void convertToHtml(TransactionInvoice transactionInvoice,TransactionInvoiceTempStorageInfo transactionInvoiceTempStorageInfo){
        Map<String, Object> input = new HashMap<>();
        input.put("transactionInvoice",transactionInvoice);
        TemplateManagerServiceImpl templateManagerServiceImpl = new TemplateManagerServiceImpl();
        if("California".equalsIgnoreCase(transactionInvoice.getSenderState())){
            transactionInvoiceTempStorageInfo.setTemplateFileName("transaction_invoice_ca");
        }
        templateManagerServiceImpl.processTemplate(transactionInvoiceTempStorageInfo.getTemplateFileName(),transactionInvoiceTempStorageInfo.getHtmlPath(),input);
    }
}
