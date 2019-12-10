package com.pan.controller;
import com.alibaba.fastjson.JSONObject;
import com.pan.model.BooksMes;
import com.pan.model.OrdersMes;
import com.pan.model.User;
import com.pan.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
@Controller

public class BuyerController {
    @Autowired
    private UserService userService;
    //个人信息以及订单信息
    @RequestMapping(value="/public/userinfo")
    public String UserInfo(String username, HttpServletRequest request, HttpSession session) {
        List<User> list = userService.findUserByNameL(username);
        User user = userService.findUserByusername(username);
        System.out.println(user.getUsername());
        System.out.println(user.getPhone());
        List<OrdersMes> lists = userService.findUserOrderMesL(user.getPhone());
        session.setAttribute("user", list);
        session.setAttribute("order", lists);
        request.setAttribute("address", user.getAddressBuyer());
        return "buyer/pages/UserInfo";

    }
    //修改信息
    @RequestMapping(value="/public/edituserinfo")
    public String EditUserInfo(String username,String address,
                               HttpSession session,HttpServletRequest request,
                               HttpServletRequest servletRequest) {
        userService.insertAddress(address,username);
        List<User> list = userService.findUserByNameL(username);
        session.setAttribute("user",list);
        request.setAttribute("address",address);
        return "buyer/pages/UserInfo";

    }
    //跳转修改信息页面
    @RequestMapping(value="/public/edituser")
    public String EditUser(String username, HttpServletRequest request)
    {
        request.setAttribute("username",username);
        System.out.println("跳转");
        return "buyer/pages/EditUserInfo";

    }
    //跳转修改密码页面
    @RequestMapping(value="/public/edituserp")
    public String EditUserp(String username, HttpServletRequest request)
    {
        request.setAttribute("username",username);

        return "buyer/pages/EditUserPwd";

    }
    //修改密码
    @RequestMapping(value="/public/edituserpwd")
    public String EditUserPwd(String username,String password,HttpServletRequest request, HttpSession session)
    {
        userService.updateUserPwd(username,password);
        List<User> list = userService.findUserByNameL(username);
        User user = userService.findUserByusername(username);
        System.out.println(user.getUsername());
        System.out.println(user.getPhone());
        List<OrdersMes> lists = userService.findUserOrderMesL(user.getPhone());
        session.setAttribute("user", list);
        session.setAttribute("order", lists);
        request.setAttribute("address", user.getAddressBuyer());
        return "buyer/pages/UserInfo";

    }
    //跳转购物车页面
    @RequestMapping(value="/public/goShoppingCart")
    public String goShoppingCart(String username,HttpServletRequest request,HttpSession session)
    {
        //request.setAttribute("username",username);
        JSONObject result = new JSONObject();
        List<User> list = userService.findUserByNameL(username);
        if(list.size()>0){
            String userid = list.get(0).getPhone();
            session.setAttribute("user", list.get(0));
            List<BooksMes> booklist = userService.getBooklist(userid);
            session.setAttribute("data", booklist);
            request.setAttribute("code", 1);
            request.setAttribute("sum", list.size());
        }else
        {
            session.setAttribute("data", null);
            request.setAttribute("code", 0);
            request.setAttribute("sum", 0);
        }

        return "buyer/pages/ShoppingCart";
    }

    //加入购物车
    @ResponseBody
    @GetMapping(value="/public/goShoppingCartAction")
    public String goShoppingCart(String username,String bookid, HttpServletRequest request)
    {
        //request.setAttribute("username",username);
        String userid = "";
        JSONObject result = new JSONObject();
        List<User> list = userService.findUserByNameL(username);
        if(list.size()<=0){
            result.put("msg", "参数错误");
            return result.toJSONString();
        }
        userid = list.get(0).getPhone();
        if(userService.addShappingCart(userid,bookid))
        {
            result.put("msg", "success");
        }else {
            result.put("msg", "数据库异常");
        }
        return result.toJSONString();

        //return "buyer/pages/ShoppingCart";

    }

    //下单
    @ResponseBody
    @GetMapping(value="/public/goOrderAction")
    public String goOrderAction(String username,String bookid, HttpServletRequest request)
    {
        //request.setAttribute("username",username);
        String userid = "";
        JSONObject result = new JSONObject();
        List<User> list = userService.findUserByNameL(username);
        if(list.size()<=0){
            result.put("msg", "参数错误");
            return result.toJSONString();
        }
        userid = list.get(0).getPhone();
        if(userService.addOrder(userid,bookid))
        {
            result.put("msg", "success");

        }else {
            result.put("msg", "数据库异常");
        }

        return result.toJSONString();

    }


}

