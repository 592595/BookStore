package com.pan.controller;

import com.pan.model.User;
import com.pan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class RegisterController {
    @Autowired
    private UserService userService;


    //    @RequestMapping(value="/public/register"/*, method= RequestMethod.POST*/)
//    public String insert(User user){
////        userService.insertSelective(user);
//        return "public/pages/register";
//    }
    @RequestMapping(value="/public/register2", method= RequestMethod.POST)
    public String insertusers(User user, HttpServletRequest request, HttpSession session){
        if(user.getType().equals("买家")){
            user.setType("0");
        }
        else{
            user.setType("1");
        }
        userService.insertuser(user);
        session.setAttribute("flag",1);
        return "/public/pages/login";
    }
    @RequestMapping(value="/public/register")
    public String register() {
        return "/public/pages/register";
    }
}
