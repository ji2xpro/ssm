package com.maoyan.ssm.controller;

import com.maoyan.ssm.model.User;
import com.maoyan.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
/**
 * @Auther: maoyan
 * @Date: 2018/8/11 00:00
 * @Description:
 */

//@Controller
@RestController
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
//    public User toIndex(HttpServletRequest request,Model model){
//        int userId = Integer.parseInt(request.getParameter("ID"));
//        User user = this.userService.getUserById(userId);
//        model.addAttribute("user", user);
//        return user;
//    }

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public User test(@RequestParam(value = "ID") int ID, Model model){
        User user = this.userService.getUserById(ID);
        model.addAttribute("user", user);
        return user;
    }


    @RequestMapping(value = "/showUser/{ID}",method = RequestMethod.GET)
    public User toIndex(@PathVariable(value = "ID") int ID,Model model){
        User user = this.userService.getUserById(ID);
        model.addAttribute("user", user);
        return user;
    }

}
