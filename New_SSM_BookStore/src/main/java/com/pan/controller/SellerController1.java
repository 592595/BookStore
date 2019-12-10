package com.pan.controller;

import com.pan.model.BooksMes;
import com.pan.model.OrdersMes;
import com.pan.service.SellerBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SellerController1 {
    @Autowired
    private SellerBookService sellerBookService;

    /**
     * 查看库存
     */
    @RequestMapping("/public/showInventory")
    public String showInventory( HttpServletRequest servletRequest, HttpSession session) {

        System.out.println(session.getAttribute("id"));
        List<BooksMes> list = (List<BooksMes>) sellerBookService.findAllBook((String) session.getAttribute("id"));

        session.setAttribute("data", list);
        servletRequest.setAttribute("code", 1);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum = sum + list.get(i).getSumBook();
        servletRequest.setAttribute("sum", sum);
        return "seller/pages/showInventory";
    }

    //    查看图书信息功能--根据图书号查看图书信息
    @RequestMapping("/public/showBookSumByID")
    public String showBookSumByIDPage(HttpServletRequest servletRequest,
                                      String bookid,
                                      HttpSession session) {
        System.out.println(session.getAttribute("id"));
        List<BooksMes> list = (List<BooksMes>) sellerBookService.findAllBook((String) session.getAttribute("id"));
        List<BooksMes> newlist = new ArrayList<BooksMes>();
        boolean tag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdBook().equals(bookid)) {
                newlist.add(list.get(i));
                tag = true;
            }
        }
        if (!tag) {
            session.setAttribute("data", list);
            servletRequest.setAttribute("error", "图书编号输入错误，请重新输入");
            servletRequest.setAttribute("code", 0);
            return "seller/pages/showInventory";
        } else {
            session.setAttribute("data", newlist);
            servletRequest.setAttribute("code", 1);
            return "seller/pages/showInventorySuccess";
        }
    }
}