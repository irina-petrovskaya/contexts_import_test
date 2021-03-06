package com.mytests.context_import;

import com.mytests.context_import.configs.java.ConfigMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by user on 25/02/16.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigMain.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
