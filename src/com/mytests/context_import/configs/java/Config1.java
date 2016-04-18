package com.mytests.context_import.configs.java;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by user on 25/02/16.
 */
@Configuration
@Import(Config3.class)
public class Config1 {
}
