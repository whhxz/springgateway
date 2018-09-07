package com.whhxz.springdemo.warehouseserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WarehouseController
 * Created by xuzhuo on 2018/9/7.
 */
@RestController
@RequestMapping("demo")
public class WarehouseController {
    @RequestMapping("list")
    public String list(){
        return "{}";
    }
}
