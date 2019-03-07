package com.machpay.reportgenerator.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class TransactionInvoice {

    private String transactionReferenceNumber;
    private String transactionStatus;
    private String referenceNumber;
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
    private String receiverBankAccountNumber;
    private String msbName;
    private String msbAddress;
    private String msbPhoneNumber;
    private String agentName;
    private String agentAddress;
    private String agentPhoneNumber;
    private String note;
    private String payeeName;
    private String payeeAddressLine1;
    private String payeeAddressLine2;
    private String payeePhoneNumber;
    private String stateEmail;
    private String stateWebsite;
    private String stateOfficeName;

    public String getTransactionReferenceNumber() {
        return transactionReferenceNumber;
    }

    public void setTransactionReferenceNumber(String transactionReferenceNumber) {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getSenderFirstName() {
        return senderFirstName;
    }

    public void setSenderFirstName(String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }

    public String getSenderMiddleName() {
        return senderMiddleName;
    }

    public void setSenderMiddleName(String senderMiddleName) {
        this.senderMiddleName = senderMiddleName;
    }

    public String getSenderLastName() {
        return senderLastName;
    }

    public void setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderPhoneNumber() {
        return senderPhoneNumber;
    }

    public void setSenderPhoneNumber(String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderCurrency() {
        return senderCurrency;
    }

    public void setSenderCurrency(String senderCurrency) {
        this.senderCurrency = senderCurrency;
    }

    public String getSenderState() {
        return senderState;
    }

    public void setSenderState(String senderState) {
        this.senderState = senderState;
    }

    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    public void setReceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }

    public String getReceiverMiddleName() {
        return receiverMiddleName;
    }

    public void setReceiverMiddleName(String receiverMiddleName) {
        this.receiverMiddleName = receiverMiddleName;
    }

    public String getReceiverLastName() {
        return receiverLastName;
    }

    public void setReceiverLastName(String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getReceiverCurrency() {
        return receiverCurrency;
    }

    public void setReceiverCurrency(String receiverCurrency) {
        this.receiverCurrency = receiverCurrency;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public BigDecimal getSenderAmount() {
        return senderAmount;
    }

    public void setSenderAmount(BigDecimal senderAmount) {
        this.senderAmount = senderAmount;
    }

    public BigDecimal getSenderTotalAmount() {
        return senderTotalAmount;
    }

    public void setSenderTotalAmount(BigDecimal senderTotalAmount) {
        this.senderTotalAmount = senderTotalAmount;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getExtraFee() {
        return extraFee;
    }

    public void setExtraFee(BigDecimal extraFee) {
        this.extraFee = extraFee;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getReceiverAmount() {
        return receiverAmount;
    }

    public void setReceiverAmount(BigDecimal receiverAmount) {
        this.receiverAmount = receiverAmount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public LocalDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAffiliateName() {
        return affiliateName;
    }

    public void setAffiliateName(String affiliateName) {
        this.affiliateName = affiliateName;
    }

    public String getDeliveryPartner() {
        return deliveryPartner;
    }

    public void setDeliveryPartner(String deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
    }

    public String getSenderBankName() {
        return senderBankName;
    }

    public void setSenderBankName(String senderBankName) {
        this.senderBankName = senderBankName;
    }

    public String getReceiverBankName() {
        return receiverBankName;
    }

    public void setReceiverBankName(String receiverBankName) {
        this.receiverBankName = receiverBankName;
    }

    public String getReceiverBankBranchName() {
        return receiverBankBranchName;
    }

    public void setReceiverBankBranchName(String receiverBankBranchName) {
        this.receiverBankBranchName = receiverBankBranchName;
    }

    public String getReceiverAccountType() {
        return receiverAccountType;
    }

    public void setReceiverAccountType(String receiverAccountType) {
        this.receiverAccountType = receiverAccountType;
    }

    public String getReceiverBankAccountNumber() {
        return receiverBankAccountNumber;
    }

    public void setReceiverBankAccountNumber(String receiverBankAccountNumber) {
        this.receiverBankAccountNumber = receiverBankAccountNumber;
    }

    public String getMsbName() {
        return msbName;
    }

    public void setMsbName(String msbName) {
        this.msbName = msbName;
    }

    public String getMsbAddress() {
        return msbAddress;
    }

    public void setMsbAddress(String msbAddress) {
        this.msbAddress = msbAddress;
    }

    public String getMsbPhoneNumber() {
        return msbPhoneNumber;
    }

    public void setMsbPhoneNumber(String msbPhoneNumber) {
        this.msbPhoneNumber = msbPhoneNumber;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentAddress() {
        return agentAddress;
    }

    public void setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
    }

    public String getAgentPhoneNumber() {
        return agentPhoneNumber;
    }

    public void setAgentPhoneNumber(String agentPhoneNumber) {
        this.agentPhoneNumber = agentPhoneNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeAddressLine1() {
        return payeeAddressLine1;
    }

    public void setPayeeAddressLine1(String payeeAddressLine1) {
        this.payeeAddressLine1 = payeeAddressLine1;
    }

    public String getPayeeAddressLine2() {
        return payeeAddressLine2;
    }

    public void setPayeeAddressLine2(String payeeAddressLine2) {
        this.payeeAddressLine2 = payeeAddressLine2;
    }

    public String getPayeePhoneNumber() {
        return payeePhoneNumber;
    }

    public void setPayeePhoneNumber(String payeePhoneNumber) {
        this.payeePhoneNumber = payeePhoneNumber;
    }

    public String getStateEmail() {
        return stateEmail;
    }

    public void setStateEmail(String stateEmail) {
        this.stateEmail = stateEmail;
    }

    public String getStateWebsite() {
        return stateWebsite;
    }

    public void setStateWebsite(String stateWebsite) {
        this.stateWebsite = stateWebsite;
    }

    public String getStateOfficeName() {
        return stateOfficeName;
    }

    public void setStateOfficeName(String stateOfficeName) {
        this.stateOfficeName = stateOfficeName;
    }
}
