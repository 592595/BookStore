package com.pan.controller;

import com.pan.model.BooksMes;
import com.pan.model.User;
import com.pan.service.AdminBookService;
import com.pan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.management.remote.rmi.RMIConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired

    private UserService userService;
    /* /public/registers*/

    @Autowired
    private AdminBookService adminBookService;

    @RequestMapping(value="/public/login")
    public String login(User user, Model model, HttpServletRequest request, HttpSession session) throws Exception {
        user = userService.checkLogin(user.getUsername(), user.getPassword());

        if (user != null) {
            session.setAttribute("username",user.getUsername());
            session.setAttribute("id",user.getPhone());
            model.addAttribute(user);

            if(user.getType().equals("1"))

                return "redirect:/public/addBookPage";

            else if(user.getType().equals("0")){
                List<BooksMes> list = adminBookService.findAllBook();
                session.setAttribute("data", list);
                request.setAttribute("code", 1);
                int sum = 0;
                for (int i = 0; i < list.size(); i++)
                    sum = sum + list.get(i).getSumBook();
                request.setAttribute("sum", sum);
                return "buyer/pages/shop";
            }

            else
                return "redirect:/public/selectAllBuyer";


        }
        session.setAttribute("flag",0);
        return "public/pages/login";
    }
    @RequestMapping(value="/public/plogin")
    public String plogin(HttpSession session)
    {
        session.setAttribute("flag",1);
        return "/public/pages/login";
    }

    @RequestMapping(value="/public/exit")
    public String exit( HttpSession session)
    {
        session.setAttribute("flag",1);
        session.setAttribute("username",null);
        return "/public/pages/login";
    }

}
