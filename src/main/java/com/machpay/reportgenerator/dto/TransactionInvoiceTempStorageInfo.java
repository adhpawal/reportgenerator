package com.machpay.reportgenerator.dto;

import java.nio.file.Paths;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class TransactionInvoiceTempStorageInfo {
    private String tempBasePath;
    private String templateDirectoryPath;
    private String templateFileName;
    private String htmlPath;
    private String xhtmlPath;
    private String pdfPath;
    private String pdfFileName;
    private String storagePath;
    private String fileNameWithoutExtension;

    /**
     * Set Default values for Invoice Generation.
     */
    public TransactionInvoiceTempStorageInfo(String fileNameWithoutExtension) {
        String tempDirectoryPath  =Paths.get("src","main", "resources","templates").toUri().getPath();
        this.setTemplateDirectoryPath(tempDirectoryPath.endsWith("/") ? tempDirectoryPath: tempDirectoryPath + "/");
        this.setTemplateFileName("transaction_invoice");
        this.setTempBasePath("/tmp/invoice/");
        this.setHtmlPath(this.getTempBasePath() + fileNameWithoutExtension+".html");
        this.setXhtmlPath(this.getTempBasePath() + fileNameWithoutExtension+".xhtml");
        this.setPdfPath(this.getTempBasePath() + fileNameWithoutExtension+".pdf");
        this.fileNameWithoutExtension = fileNameWithoutExtension;
    }

    public String getTempBasePath() {
        return tempBasePath;
    }

    public void setTempBasePath(String tempBasePath) {
        this.tempBasePath = tempBasePath;
    }

    public String getTemplateFileName() {
        return templateFileName;
    }

    public void setTemplateFileName(String templateFileName) {
        this.templateFileName = templateFileName;
    }

    public String getTemplateDirectoryPath() {
        return templateDirectoryPath;
    }

    public void setTemplateDirectoryPath(String templateDirectoryPath) {
        this.templateDirectoryPath = templateDirectoryPath;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public String getXhtmlPath() {
        return xhtmlPath;
    }

    public void setXhtmlPath(String xhtmlPath) {
        this.xhtmlPath = xhtmlPath;
    }

    public String getPdfPath() {
        return pdfPath;
    }

    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }

    public String getPdfFileName() {
        return pdfFileName;
    }

    public void setPdfFileName(String pdfFileName) {
        this.pdfFileName = pdfFileName;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public String getFileNameWithoutExtension() {
        return fileNameWithoutExtension;
    }

    public void setFileNameWithoutExtension(String fileNameWithoutExtension) {
        this.fileNameWithoutExtension = fileNameWithoutExtension;
    }
}
