package com.machpay.reportgenerator;

import com.machpay.reportgenerator.builder.TransactionInvoiceBuilder;
import com.machpay.reportgenerator.dto.TransactionInvoice;
import com.machpay.reportgenerator.dto.TransactionInvoiceTempStorageInfo;
import com.machpay.reportgenerator.service.TransactionInvoiceGenerator;
import com.machpay.reportgenerator.service.impl.TransactionInvoiceGeneratorImpl;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class PdfGeneratorDemo {

    public static void main(String[] args) {
        TransactionInvoiceTempStorageInfo transactionInvoiceTempStorageInfo = new TransactionInvoiceTempStorageInfo("pawal");

        TransactionInvoice transactionInvoice = new TransactionInvoiceBuilder()
                .setTransactionReferenceNumber("169023527528")
                .setTransactionStatus("Cancelled")
                .setPaymentType("Account Deposit")
                .setTransactionDate(LocalDate.now())
                .setEstimatedDeliveryDate(LocalDate.now())
                .setMsbName("Moneytun LLC")
                .setMsbAddress("3651 Lindell Rd Ste D225 Las Vegas, NV 89103")
                .setMsbPhoneNumber("702-485-5886")
                .setAgentName("FOCUS FINANCIAL (AL)")
                .setAgentAddress("1035 SAN PABLO AVE., SUITE 3 ALBANY,CA 94706")
                .setAgentPhoneNumber("(415) 644-5933")
                .setSenderFirstName("SABITRI")
                .setSenderLastName("SABITRI")
                .setSenderAddress("5550 CENTRAL AVE # 4, EL CERRITO, CA 94530")
                .setSenderPhoneNumber("5103676476")
                .setReceiverFirstName("ISHWORI")
                .setReceiverLastName("NEUPANE")
                .setReceiverAddress("BALAJU KATHMANDU, NEPAL, NEPAL")
                .setReceiverPhoneNumber("9843050322")
                .setReferenceNumber("MTN-20199123-12312")
                .setSenderAmount(BigDecimal.valueOf(500))
                .setExchangeRate(BigDecimal.valueOf(105.39))
                .setFee(BigDecimal.valueOf(5))
                .setReceiverCurrency("NPR")
                .setExtraFee(BigDecimal.ZERO)
                .setTotalFee(BigDecimal.valueOf(5))
                .setSenderCurrency("USD")
                .setSenderTotalAmount(BigDecimal.valueOf(508))
                .setReceiverAmount(BigDecimal.valueOf(52695.00))
                .setAffiliateName("THAMEL REMIT")
                .setNote("MESSAGE")
                .build();
        TransactionInvoiceGenerator transactionInvoiceGenerator = new TransactionInvoiceGeneratorImpl();
        transactionInvoiceGenerator.generateTransactionInvoice(transactionInvoice,transactionInvoiceTempStorageInfo);
    }
}
