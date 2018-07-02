package com.machpay.reportgenerator.service;

import com.machpay.reportgenerator.dto.TransactionInvoiceTempStorageInfo;
import com.machpay.reportgenerator.dto.TransactionInvoice;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public interface TransactionInvoiceGenerator {

    void generateTransactionInvoice(TransactionInvoice transactionInvoice,TransactionInvoiceTempStorageInfo transactionInvoiceTempStorageInfo);
}
