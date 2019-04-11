package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {
    @RequestMapping("test")
    public String test(ModelMap modelMap){
        modelMap.addAttribute("aaa","aaaa");
        return "index";
    }
}
