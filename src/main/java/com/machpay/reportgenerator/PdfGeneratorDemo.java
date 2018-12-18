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
                .setTransactionStatus("CANCELEDD")
                .setPaymentType("Account Deposit")
                .setTransactionDate(LocalDate.now())
                .setEstimatedDeliveryDate(LocalDate.now())
                .setSenderState("CA")
                .setMsbName("Moneytun LLC")
                .setMsbAddress("3651 Lindell Rd Ste D225 Las Vegas, NV 89103")
                .setMsbPhoneNumber("702-485-5886")
                .setAgentName(" Rebtel Networks AB")
                .setAgentAddress("Jakobsbergsgatan 16 111 44 Stockholm Sweden")
                .setAgentPhoneNumber("415-644-5933")
                .setSenderFirstName("JOHN")
                .setSenderLastName("TAYLOR")
                .setSenderAddress("5550 CENTRAL AVE # 4, EL CERRITO, CA 94530")
                .setSenderPhoneNumber("5103676476")
                .setReceiverFirstName("GEORGE")
                .setReceiverLastName("KEN")
                .setReceiverAddress("101 BOND STREET, NIGERIA")
                .setReceiverPhoneNumber("9843050322")
                .setReferenceNumber("MTN-20199123-12312")
                .setSenderAmount(BigDecimal.valueOf(100.00))
                .setExchangeRate(BigDecimal.valueOf(363.05))
                .setFee(BigDecimal.valueOf(5.00))
                .setReceiverCurrency("NGN")
                .setExtraFee(BigDecimal.ZERO)
                .setTotalFee(BigDecimal.valueOf(5.00))
                .setSenderCurrency("USD")
                .setSenderTotalAmount(BigDecimal.valueOf(105.00))
                .setReceiverAmount(BigDecimal.valueOf(36305.00))
                .setAffiliateName("REBTEL")
                .setNote("MESSAGE")
                .build();
        TransactionInvoiceGenerator transactionInvoiceGenerator = new TransactionInvoiceGeneratorImpl();
        transactionInvoiceGenerator.generateTransactionInvoice(transactionInvoice,transactionInvoiceTempStorageInfo);
    }
}
