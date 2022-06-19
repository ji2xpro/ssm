package com.xxx.yyy.ssm.controller;

import com.xxx.yyy.ssm.model.UserMaster;
import com.xxx.yyy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author: maoyan
 * @date: 2018/8/11 00:00
 * @description:
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
    public UserMaster test(@RequestParam(value = "ID") int ID, Model model){
        UserMaster user = this.userService.getUserById(ID);
        model.addAttribute("user", user);
        return user;
    }


    @RequestMapping(value = "/showUser/{ID}",method = RequestMethod.GET)
    public UserMaster toIndex(@PathVariable(value = "ID") int ID,Model model){
        UserMaster user = this.userService.getUserById(ID);
        model.addAttribute("user", user);
        return user;
    }

}
