package com.mytests.context_import.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 25/02/16.
 */
public class B1 {

    @Autowired
    private B2 b2;
}
