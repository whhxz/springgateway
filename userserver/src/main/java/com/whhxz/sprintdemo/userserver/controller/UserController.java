package com.whhxz.sprintdemo.userserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 * Created by xuzhuo on 2018/9/7.
 */
@RestController
@RequestMapping("demo")
public class UserController {
    @RequestMapping("list")
    public String list() {
        return "{\"username\":\"whh\"}";
    }
}
