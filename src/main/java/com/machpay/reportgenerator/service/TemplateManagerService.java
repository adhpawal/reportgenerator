package com.machpay.reportgenerator.service;

import java.util.Map;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public interface TemplateManagerService {

    void processTemplate(String templateName,String outputFileName, Map<String, Object> data);
}
