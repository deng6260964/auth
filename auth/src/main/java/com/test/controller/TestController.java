package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * com.test.controller
 * Created by dengjinhui on 16/3/23.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
