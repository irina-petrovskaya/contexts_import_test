package com.mytests.context_import.configs.java;

import com.mytests.context_import.configs.components.Comp3;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by user on 25/02/16.
 */
@Configuration
@Import(Comp3.class)
@ImportResource({"classpath:com/mytests/context_import/configs/xml/*.xml","classpath:com/mytests/context_import/configs/xml/extra/c4.xml"})
public class Config3 {
}
