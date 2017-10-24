package com.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * com.auth.controller
 * Created by dengjinhui on 16/8/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/turnTo")
    public String turnToList(Model model,HttpServletRequest request,HttpServletResponse response){
        model.addAttribute("test","test232");
        return "test";
    }
}
