package cn.fm.demo.controller;

import cn.fm.demo.model.User;
import cn.fm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findUser")
    public User findUser(@RequestParam String id){
        return userService.findById(id);
    }
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

}
