package com.pan.controller;

import com.pan.model.BooksMes;
import com.pan.service.AdminBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController2 {

    @Autowired
    private AdminBookService adminBookService;

    //    查看图书信息功能--显示书籍总数
    @RequestMapping("/public/showBookSum")
    public String showBookSumPage(HttpServletRequest servletRequest,
                                  HttpSession session) {
        List<BooksMes> list = adminBookService.findAllBook();
        session.setAttribute("data", list);
        servletRequest.setAttribute("code", 1);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum = sum + list.get(i).getSumBook();
        servletRequest.setAttribute("sum", sum);
        return "admin/pages/showBookSum";
    }

    //    查看图书信息功能--根据类别查看图书信息
    @RequestMapping("/public/showBookSumByType")
    public String showBookSumByTypePage(HttpServletRequest servletRequest,
                                        String bookType,
                                        HttpSession session) {
        List<BooksMes> list = adminBookService.findAllBook();
        List<BooksMes> newlist = new ArrayList<BooksMes>();
        boolean tag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTypeBook().equals(bookType)) {
                newlist.add(list.get(i));
                tag = true;
            }
        }
        if (!tag) {
            session.setAttribute("data", list);
            servletRequest.setAttribute("error", "图书类别输入错误，请重新输入");
            servletRequest.setAttribute("code", 0);
            return "admin/pages/showBookSum";
        } else {
            session.setAttribute("data", newlist);
            servletRequest.setAttribute("code", 1);
            return "admin/pages/showBookByType";
        }
    }
}
