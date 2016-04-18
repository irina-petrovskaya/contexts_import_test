package com.mytests.context_import.configs.java.scanned;

import com.mytests.context_import.beans.B5;
import com.mytests.context_import.configs.java.SuperConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by user on 25/02/16.
 */
@Configuration
@Import(SuperConfig.class)
public class Config4 {
    @Bean
    B5 b5(){
        return new B5();
    }
}
