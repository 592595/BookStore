package com.pan.controller;

import com.pan.model.BooksMes;
import com.pan.model.User;
import com.pan.service.AdminBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class publiccontroller {
    @Autowired
    private AdminBookService adminBookService;

    @RequestMapping(value="/public/buyershop")
    public String selectAllBuyerPage(HttpServletRequest request, HttpSession session) {
        List<BooksMes> list = adminBookService.findAllBook();
        session.setAttribute("data", list);
        request.setAttribute("code", 1);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum = sum + list.get(i).getSumBook();
        request.setAttribute("sum", sum);
        return "buyer/pages/shop";
    }
}
