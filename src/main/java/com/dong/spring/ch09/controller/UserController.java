package com.dong.spring.ch09.controller;

import com.dong.spring.ch09.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserServer userServer;

}
