package cn.springmvc.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("loginView")
    public String gotoLoginView(){
      return "loginView";
    }
}
