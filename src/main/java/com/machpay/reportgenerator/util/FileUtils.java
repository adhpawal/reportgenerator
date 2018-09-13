package com.machpay.reportgenerator.util;

import java.io.File;

public class FileUtils {

    public static void createDirectoryIfNotExist(String name){
        File directory = new File(name);
        if (! directory.exists()){
            directory.mkdirs();
        }
    }
}
