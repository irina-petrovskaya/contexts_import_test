package com.mytests.context_import.configs.java;

import com.mytests.context_import.beans.B6;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by user on 18/04/16.
 */
@Configuration
public class SuperConfigImpl1 extends SuperConfig {
    @Bean() // should not be detected
    B6 b6(){
        return new B6();
    }
}
