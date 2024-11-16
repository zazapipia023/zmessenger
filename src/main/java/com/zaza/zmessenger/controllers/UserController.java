package com.zaza.zmessenger.controllers;

import com.zaza.zmessenger.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("")
public class UserController {

    private UserService userService;

    @GetMapping("/welcome")
    public String getAllUsers() {
        return "hello";
    }

}
