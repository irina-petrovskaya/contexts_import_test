package com.mytests.context_import.configs.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by user on 25/02/16.
 */
@Component
public class Comp3 {
    @Autowired
    private Comp2 comp2;
}
