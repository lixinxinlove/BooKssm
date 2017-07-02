package com.lee.web;

import com.lee.entity.Book;
import com.lee.entity.User;
import com.lee.service.BookService;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by android on 2017/6/28.
 */

@Controller
@RequestMapping("/user") // url:/模块/资源/{id}/细分 /seckill/list
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    private String register(String name, String password) {
        User user = new User();
        user.setUserName(name);
        user.setUserPassword(password);
        userService.addUser(user);

        return "list";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private String login(String userName, String userPassword, Model model) {

        User user = userService.queryByName(userName);

        if (user != null) {


            return  "redirect:/book/list ";

            //  List<Book> list = bookService.getList();
         //   model.addAttribute("itemsList", list);
         //   return "list";// WEB-INF/jsp/"list".jsp

        } else {
            return "list";
        }
    }


}
