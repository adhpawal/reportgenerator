package com.machpay.reportgenerator.util;

import org.w3c.tidy.Tidy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class XhtmlToHtmlConverter {

    private XhtmlToHtmlConverter(){}

    public static void convertXHTMLToHTML(String inputFile, String outputFile) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
                InputStream inputStream = new FileInputStream(new File(inputFile))) {
            Tidy tidy = new Tidy();
            tidy.setXHTML(true);
            tidy.parse(inputStream, fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
