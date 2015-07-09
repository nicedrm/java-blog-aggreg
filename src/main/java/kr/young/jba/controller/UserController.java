package kr.young.jba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.young.jba.entity.User;
import kr.young.jba.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping
    public String users(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }
    
    @RequestMapping("/{id}")
    public String user(Model model, @PathVariable int id) {
        User user = userService.findOne(id);
        model.addAttribute("user", user);
        return "user-detail";
    }

}
