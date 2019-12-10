package com.pan.controller;

import com.pan.model.BuyerMes;
import com.pan.service.AdminBuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController1 {
    @Autowired
    private AdminBuyerService adminBuyerService;

    //    查看买家信息功能--查看所有图书
    @RequestMapping("/public/selectAllBuyer")
    public String selectAllBuyerPage(Model model,
                                     HttpServletRequest servletRequest,
                                     HttpSession session) {
        List<BuyerMes> list = adminBuyerService.findAllBuyers();
//        BuyerMes userInfo = list.get(0);
//        System.out.println(userInfo);
        session.setAttribute("data", list);
        servletRequest.setAttribute("code", 1);
        return "admin/pages/selectAllBuyer";
    }

    //    查看买家信息功能--根据信誉积分排序查看所有图书
    @RequestMapping("/public/selectBuyerByScore")
    public String selectBuyerByScorePage(Model model,
                                         HttpServletRequest servletRequest,
                                         HttpSession session) {
        List<BuyerMes> list = adminBuyerService.findBuyerByScore();
        session.setAttribute("data", list);
        servletRequest.setAttribute("code", 1);
        return "admin/pages/selectBuyerByScore";
    }

}
