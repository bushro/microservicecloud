package com.smxy.lq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BushRo
 * @Description: TOTO
 * @date 2018-12-28
 */
@RestController
public class testController {
    @RequestMapping("test")
    public String test(){
        return "hello";
    }
}
