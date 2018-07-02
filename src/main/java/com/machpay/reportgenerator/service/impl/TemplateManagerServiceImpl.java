package com.machpay.reportgenerator.service.impl;

import com.machpay.reportgenerator.service.TemplateManagerService;
import freemarker.cache.StringTemplateLoader;
import freemarker.ext.beans.BeansWrapperBuilder;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Map;

public class TemplateManagerServiceImpl implements TemplateManagerService {
    private Configuration freemarkerConfig;
    private static final String TEMPLATE_DIRECTORY = "src/main/resources/templates/";

    TemplateManagerServiceImpl() {
        freemarkerConfig = new Configuration(Configuration.VERSION_2_3_23);
        freemarkerConfig.setTagSyntax(Configuration.ANGLE_BRACKET_TAG_SYNTAX);
        freemarkerConfig.setDefaultEncoding("UTF-8");
        freemarkerConfig.setNumberFormat("computer");
        freemarkerConfig.setObjectWrapper(new BeansWrapperBuilder(Configuration.VERSION_2_3_23).build());
        freemarkerConfig.setTemplateLoader(new StringTemplateLoader());
        freemarkerConfig.setLocale(Locale.US);
        freemarkerConfig.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        freemarkerConfig.setIncompatibleImprovements(new Version(2, 3, 23));
    }

    private Template loadTemplate(String templateName, String templatePath) {
        try {
            String templateContent = new String(Files.readAllBytes(Paths.get(templatePath)));
            ((StringTemplateLoader) freemarkerConfig.getTemplateLoader()).putTemplate(templateName, templateContent);
            return freemarkerConfig.getTemplate(templateName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void processTemplate(String templateName,String outputFileName, Map<String, Object> data) {
        Template template = loadTemplate(templateName, TEMPLATE_DIRECTORY + templateName + ".ftl");
        try (Writer fileWriter = new FileWriter(new File(outputFileName))) {
            template.process(data, fileWriter);
        } catch (IOException | TemplateException e) {
            throw new RuntimeException(e);
        }
    }
}