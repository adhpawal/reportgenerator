package com.machpay.reportgenerator.dto;

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
}
