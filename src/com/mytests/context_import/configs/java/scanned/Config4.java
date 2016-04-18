package com.mytests.context_import.configs.java.scanned;

import com.mytests.context_import.beans.B5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by user on 25/02/16.
 */
@Configuration
public class Config4 {
    @Bean
    B5 b5(){
        return new B5();
    }
}
