/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luciano.galvani
 */
public class HelloWorldFreemarkerStyle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);

            cfg.setClassForTemplateLoading(HelloWorldFreemarkerStyle.class, "/");

            cfg.setDefaultEncoding("UTF-8");

            Template helloTemplate = cfg.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
            Map<String, Object> helloMap = new HashMap<String, Object>();
            helloMap.put("name", "Snow");

            helloTemplate.process(helloMap, writer);

            System.out.println(writer);

        } catch (IOException | TemplateException ex) {
            Logger.getLogger(HelloWorldFreemarkerStyle.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
