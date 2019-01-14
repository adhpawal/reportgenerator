package com.machpay.reportgenerator.builder;

import com.machpay.reportgenerator.dto.TransactionInvoice;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class TransactionInvoiceBuilder {
    private String transactionReferenceNumber;
    private String transactionStatus;
    private String senderFirstName;
    private String senderMiddleName;
    private String senderLastName;
    private String senderEmail;
    private String senderPhoneNumber;
    private String senderCountry;
    private String senderAddress;
    private String senderCurrency;
    private String senderState;
    private String receiverFirstName;
    private String receiverMiddleName;
    private String receiverLastName;
    private String receiverPhoneNumber;
    private String receiverCountry;
    private String receiverCurrency;
    private String receiverAddress;
    private String receiverProvince;
    private BigDecimal senderAmount;
    private BigDecimal senderTotalAmount;
    private BigDecimal exchangeRate;
    private BigDecimal fee;
    private BigDecimal extraFee;
    private BigDecimal totalFee;
    private BigDecimal receiverAmount;
    private LocalDate transactionDate;
    private LocalDate estimatedDeliveryDate;
    private String paymentType;
    private String affiliateName;
    private String deliveryPartner;
    private String senderBankName;
    private String receiverBankName;
    private String receiverBankBranchName;
    private String receiverAccountType;
    private String msbName;
    private String msbAddress;
    private String msbPhoneNumber;
    private String agentName;
    private String agentAddress;
    private String agentPhoneNumber;
    private String note;
    private String referenceNumber;
    private String receiverBankAccountNumber;
    private String stateEmail;
    private String stateWebsite;
    private String stateOfficeName;

    public TransactionInvoiceBuilder setTransactionReferenceNumber(String transactionReferenceNumber) {
        this.transactionReferenceNumber = transactionReferenceNumber;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverBankAccountNumber(String receiverBankAccountNumber) {
        this.receiverBankAccountNumber = receiverBankAccountNumber;
        return this;
    }

    public TransactionInvoiceBuilder setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    public TransactionInvoiceBuilder setSenderFirstName(String senderFirstName) {
        this.senderFirstName = senderFirstName;
        return this;
    }

    public TransactionInvoiceBuilder setSenderMiddleName(String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
        return this;
    }

    public TransactionInvoiceBuilder setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
        return this;
    }

    public TransactionInvoiceBuilder setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
        return this;
    }

    public TransactionInvoiceBuilder setSenderPhoneNumber(String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
        return this;
    }

    public TransactionInvoiceBuilder setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
        return this;
    }

    public TransactionInvoiceBuilder setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
        return this;
    }

    public TransactionInvoiceBuilder setSenderCurrency(String senderCurrency) {
        this.senderCurrency = senderCurrency;
        return this;
    }

    public TransactionInvoiceBuilder setSenderState(String senderState) {
        this.senderState = senderState;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverMiddleName(String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverLastName(String receiverLastName) {
        this.receiverLastName = receiverLastName;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverCurrency(String receiverCurrency) {
        this.receiverCurrency = receiverCurrency;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
        return this;
    }

    public TransactionInvoiceBuilder setSenderAmount(BigDecimal senderAmount) {
        this.senderAmount = senderAmount;
        return this;
    }

    public TransactionInvoiceBuilder setSenderTotalAmount(BigDecimal senderTotalAmount) {
        this.senderTotalAmount = senderTotalAmount;
        return this;
    }

    public TransactionInvoiceBuilder setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    public TransactionInvoiceBuilder setFee(BigDecimal fee) {
        this.fee = fee;
        return this;
    }

    public TransactionInvoiceBuilder setExtraFee(BigDecimal extraFee) {
        this.extraFee = extraFee;
        return this;
    }

    public TransactionInvoiceBuilder setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverAmount(BigDecimal receiverAmount) {
        this.receiverAmount = receiverAmount;
        return this;
    }

    public TransactionInvoiceBuilder setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    public TransactionInvoiceBuilder setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        return this;
    }

    public TransactionInvoiceBuilder setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public TransactionInvoiceBuilder setAffiliateName(String affiliateName) {
        this.affiliateName = affiliateName;
        return this;
    }

    public TransactionInvoiceBuilder setDeliveryPartner(String deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
        return this;
    }

    public TransactionInvoiceBuilder setSenderBankName(String senderBankName) {
        this.senderBankName = senderBankName;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverBankName(String receiverBankName) {
        this.receiverBankName = receiverBankName;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverBankBranchName(String receiverBankBranchName) {
        this.receiverBankBranchName = receiverBankBranchName;
        return this;
    }

    public TransactionInvoiceBuilder setReceiverAccountType(String receiverAccountType) {
        this.receiverAccountType = receiverAccountType;
        return this;
    }

    public TransactionInvoiceBuilder setMsbName(String msbName) {
        this.msbName = msbName;
        return this;
    }

    public TransactionInvoiceBuilder setMsbAddress(String msbAddress) {
        this.msbAddress = msbAddress;
        return this;
    }

    public TransactionInvoiceBuilder setMsbPhoneNumber(String msbPhoneNumber) {
        this.msbPhoneNumber = msbPhoneNumber;
        return this;
    }

    public TransactionInvoiceBuilder setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    public TransactionInvoiceBuilder setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
        return this;
    }

    public TransactionInvoiceBuilder setAgentPhoneNumber(String agentPhoneNumber) {
        this.agentPhoneNumber = agentPhoneNumber;
        return this;
    }

    public TransactionInvoiceBuilder setNote(String note) {
        this.note = note;
        return this;
    }

    public TransactionInvoiceBuilder setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    public TransactionInvoiceBuilder setStateOffice(String officeName) {
        this.stateOfficeName = officeName;
        return this;
    }

    public TransactionInvoiceBuilder setStateEmail(String stateEmail) {
        this.stateEmail = stateEmail;
        return this;
    }

    public TransactionInvoiceBuilder setStateWebsite(String website) {
        this.stateWebsite = website;
        return this;
    }

    public TransactionInvoice build(){
        TransactionInvoice transactionInvoice = new TransactionInvoice();
        transactionInvoice.setTransactionReferenceNumber(this.transactionReferenceNumber);
        transactionInvoice.setTransactionStatus(this.transactionStatus);
        transactionInvoice.setSenderFirstName(this.senderFirstName);
        transactionInvoice.setSenderMiddleName(this.senderMiddleName);
        transactionInvoice.setSenderLastName(this.senderLastName);
        transactionInvoice.setSenderEmail(this.senderEmail);
        transactionInvoice.setSenderPhoneNumber(this.senderPhoneNumber);
        transactionInvoice.setSenderCountry(this.senderCountry);
        transactionInvoice.setSenderAddress(this.senderAddress);
        transactionInvoice.setSenderCurrency(this.senderCurrency);
        transactionInvoice.setSenderState(this.senderState);
        transactionInvoice.setReceiverFirstName(this.receiverFirstName);
        transactionInvoice.setReceiverMiddleName(this.receiverMiddleName);
        transactionInvoice.setReceiverLastName(this.receiverLastName);
        transactionInvoice.setReceiverPhoneNumber(this.receiverPhoneNumber);
        transactionInvoice.setReceiverCountry(this.receiverCountry);
        transactionInvoice.setReceiverCurrency(this.receiverCurrency);
        transactionInvoice.setReceiverAddress(this.receiverAddress);
        transactionInvoice.setReceiverProvince(this.receiverProvince);
        transactionInvoice.setSenderAmount(this.senderAmount);
        transactionInvoice.setSenderTotalAmount(this.senderTotalAmount);
        transactionInvoice.setExchangeRate(this.exchangeRate);
        transactionInvoice.setFee(this.fee);
        transactionInvoice.setExtraFee(this.extraFee);
        transactionInvoice.setTotalFee(this.totalFee);
        transactionInvoice.setReceiverAmount(this.receiverAmount);
        transactionInvoice.setTransactionDate(this.transactionDate);
        transactionInvoice.setEstimatedDeliveryDate(this.estimatedDeliveryDate);
        transactionInvoice.setPaymentType(this.paymentType);
        transactionInvoice.setAffiliateName(this.affiliateName);
        transactionInvoice.setDeliveryPartner(this.deliveryPartner);
        transactionInvoice.setSenderBankName(this.senderBankName);
        transactionInvoice.setReceiverBankName(this.receiverBankName);
        transactionInvoice.setReceiverBankBranchName(this.receiverBankBranchName);
        transactionInvoice.setReceiverAccountType(this.receiverAccountType);
        transactionInvoice.setMsbName(this.msbName);
        transactionInvoice.setMsbAddress(this.msbAddress);
        transactionInvoice.setMsbPhoneNumber(this.msbPhoneNumber);
        transactionInvoice.setAgentName(this.agentName);
        transactionInvoice.setAgentAddress(this.agentAddress);
        transactionInvoice.setAgentPhoneNumber(this.agentPhoneNumber);
        transactionInvoice.setNote(this.note);
        transactionInvoice.setReferenceNumber(this.referenceNumber);
        transactionInvoice.setReceiverBankAccountNumber(this.receiverBankAccountNumber);
        transactionInvoice.setStateOfficeName(this.stateOfficeName);
        transactionInvoice.setStateEmail(this.stateEmail);
        transactionInvoice.setStateWebsite(this.stateWebsite);
        return transactionInvoice;
    }
}
