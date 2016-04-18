package com.mytests.context_import.configs.components;

import com.mytests.context_import.beans.B1;
import com.mytests.context_import.beans.B5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by user on 25/02/16.
 */
@Component
public class Comp1 {

    @Autowired
    private B5 b5;
    @Autowired
    private B1 b1;
}
