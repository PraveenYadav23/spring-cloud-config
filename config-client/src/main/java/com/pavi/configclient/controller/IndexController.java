package com.pavi.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Praveen Yadav
 * @since 26-Sep-2021, 7:10 PM
 */
@RestController
@RefreshScope
public class IndexController {

    @Value("${message: We didn't find any value}")
    private String message;

    @GetMapping("/index")
    public String getMessage(){
        return message;
    }
}
