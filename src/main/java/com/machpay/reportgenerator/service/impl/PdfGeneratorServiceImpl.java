package com.machpay.reportgenerator.service.impl;

import com.machpay.reportgenerator.service.ReportGeneratorService;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static com.itextpdf.text.pdf.BaseFont.EMBEDDED;
import static com.itextpdf.text.pdf.BaseFont.IDENTITY_H;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class PdfGeneratorServiceImpl implements ReportGeneratorService {

    @Override
    public void generate(String inputFileName, String outputFileName) {
        try (OutputStream outputStream = new FileOutputStream(outputFileName)){
            String xHtml = readFileToString(inputFileName);

            ITextRenderer renderer = new ITextRenderer();
            renderer.getFontResolver().addFont("/tmp/invoice/Code39.ttf", IDENTITY_H, EMBEDDED);
            String baseUrl = FileSystems
                    .getDefault()
                    .getPath("src")
                    .toUri()
                    .toURL()
                    .toString();
            renderer.setDocumentFromString(xHtml, baseUrl);
            renderer.layout();
            renderer.createPDF(outputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private String readFileToString(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath),StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
