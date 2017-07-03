package com.lee.web;

import com.lee.entity.User;
import com.lee.service.BookService;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by android on 2017/6/28.
 */

@Controller
@RequestMapping("/user") // url:/模块/资源/{id}/细分 /seckill/list
@SessionAttributes({"userName","userPassword"})
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
            //转到另一个控制器
            model.addAttribute("userName", "lixinxin");
            model.addAttribute("userPassword", "lixinxinlove");

            return "redirect:/book/list ";
        } else {
            return "error";
        }
    }
}
