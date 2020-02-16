package com.theo.springbootdemo.controller;

import com.theo.springbootdemo.model.User;
import com.theo.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController
{

        @Autowired
        private UserService userService;

        @RequestMapping(value = "/getAll")
        public List<User> getAllUser(){

                return userService.getUsers();
        }


}
