package com.security.project.controller;

import com.security.project.dot.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhu
 * @date 2019/4/6 20:55
 */

@RestController
public class UserController {

    @GetMapping("/getUser")
    public String getUser(List<User> userList){
        return "user";
    }
}
