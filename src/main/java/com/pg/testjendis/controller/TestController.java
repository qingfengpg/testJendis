package com.pg.testjendis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: PG
 * @Description:
 * @Date: Createed in 10:13 2019/7/5
 * @Modified By:
 */
@RestController
public class TestController {
    @RequestMapping(value = "/hi")
    public String getMsg(@RequestParam String name) {
        return "你好：" + name + ", 这是jenkins自动集成测试";
    }
}
