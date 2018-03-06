package com.auth.controller;

import com.auth.model.AuthUserModel;
import com.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * com.auth.controller
 * Created by dengjinhui on 2017/12/20.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login")
    public String turnToList(Model model, HttpServletRequest request, HttpServletResponse response){
        model.addAttribute("test","test232");
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        AuthUserModel userModel = new AuthUserModel();
        userModel.setLoginName(loginName);
        userModel.setPassword(password);
        userService.add(userModel);
        return "test";
    }
}
