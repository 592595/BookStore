package com.pan.controller;

import com.pan.model.BooksMes;
import com.pan.service.SellerBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SellerController2 {
    @Autowired
    private SellerBookService sellerBookService;
    /**
     //     * 上架图书
     //     * @param booksMes
     //     * @return
     //     */
    @RequestMapping("/public/addBookPage")
    public String addBookPage(){
        return "seller/pages/addBook";
    }
    @RequestMapping("/public/addBook")
    public String addBook(BooksMes booksMes, HttpSession session, HttpServletRequest servletRequest){
        String IDseller=(String) session.getAttribute("id");
        List<BooksMes> list = sellerBookService.findAllBook(IDseller);
        booksMes.setIdSeller(IDseller);
        sellerBookService.addBook(booksMes);

        List<BooksMes> newlist = sellerBookService.findAllBook(IDseller);
        session.setAttribute("data", newlist);
        servletRequest.setAttribute("code", 1);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum = sum + list.get(i).getSumBook();
        servletRequest.setAttribute("sum", sum);
        return "seller/pages/showInventory";
    }
}
