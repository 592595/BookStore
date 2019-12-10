package com.pan.controller;

import com.pan.model.OrdersMes;
import com.pan.service.ShoworderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShowOrderController {
    @Autowired
    private ShoworderService showorderService;
    @RequestMapping("/public/selectAllOrder")
    public String selectAllOrder(Model model,
                                     HttpServletRequest servletRequest,
                                     HttpSession session) {

        System.out.println(session.getAttribute("id"));
        List<OrdersMes> list = (List<OrdersMes>) showorderService.findAllOrders((String) session.getAttribute("id"));
        OrdersMes userInfo = list.get(0);
        System.out.println(userInfo);
        session.setAttribute("data", list);
    servletRequest.setAttribute("code", 1);
        return "seller/pages/showorder";
    }
//修改订单
    @RequestMapping("/public/deliver")
    public String selectAllOrder(HttpServletRequest servletRequest,
                                 String BookID,
                                 HttpSession session) {
        showorderService.updatedeliver(BookID);
        List<OrdersMes> list = (List<OrdersMes>) showorderService.findAllOrders((String) session.getAttribute("id"));
        OrdersMes userInfo = list.get(0);
        System.out.println(userInfo);
        session.setAttribute("data", list);
        servletRequest.setAttribute("code", 1);
        return "seller/pages/showorder";
    }

}
