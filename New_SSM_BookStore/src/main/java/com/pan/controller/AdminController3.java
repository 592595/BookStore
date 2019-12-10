package com.pan.controller;

import com.pan.model.BooksMes;
import com.pan.service.AdminBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController3 {

    @Autowired
    private AdminBookService adminBookService;
    //    违规图书处理
    @RequestMapping("/public/BookViolation")
    public String BookViolationPage(HttpServletRequest servletRequest,
                                    String BookID,
                                    HttpSession session) {
        adminBookService.updateBook(BookID);
//        List<BooksMes> newlist = adminBookService.findAllBook();
//        session.setAttribute("data", newlist);
//        servletRequest.setAttribute("code",1);
        return "redirect:/public/showBookSum";
    }

    //    显示违规所有图书
    @RequestMapping("/public/findViolationBook")
    public String BookUnderPage(HttpServletRequest servletRequest,
                                  HttpSession session) {
        List<BooksMes> newlist = adminBookService.findViolationBook();
        session.setAttribute("data", newlist);
        servletRequest.setAttribute("code", 1);
        return "admin/pages/BookViolation";
    }
    //    取消违规标记
    @RequestMapping("/public/CancelBookViolation")
    public String CancelBookViolationPage(HttpServletRequest servletRequest,
                                          String BookID,
                                          HttpSession session) {
        adminBookService.updateBookCancel(BookID);
        List<BooksMes> newlist = adminBookService.findViolationBook();
        session.setAttribute("data", newlist);
        servletRequest.setAttribute("code", 1);
        return "admin/pages/BookViolation";
    }

}
