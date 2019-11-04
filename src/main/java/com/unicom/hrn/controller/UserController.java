package com.unicom.hrn.controller;

import com.unicom.hrn.service.SysUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    SysUserInfoService sysUserInfoService;

    @RequestMapping("/login")
    public List<String> login(@RequestParam String userCode){
        return sysUserInfoService.getSiteCodeByUserCode(userCode);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world！";
    }
}
