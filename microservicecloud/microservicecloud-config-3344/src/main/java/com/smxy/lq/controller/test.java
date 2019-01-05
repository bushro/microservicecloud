package com.smxy.lq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BushRo
 * @Description: TOTO
 * @date 2019-01-05
 */
@RestController
public class test {
    @RequestMapping("test")
    public String test(){
        return "string";
    }
}
