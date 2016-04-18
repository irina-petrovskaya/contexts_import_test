package com.mytests.context_import.configs.java;

import com.mytests.context_import.configs.components.Comp1;
import com.mytests.context_import.configs.components.Comp2;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by user on 25/02/16.
 */
@Configuration
@Import({Comp1.class,Comp2.class, Config1.class})
public class ConfigMain {
}
