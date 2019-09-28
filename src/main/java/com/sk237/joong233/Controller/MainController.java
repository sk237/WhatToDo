package com.sk237.joong233.Controller;

import com.sk237.joong233.Service.LogoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private LogoutService logoutService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("joinPage")
    public String joinPage() {
        return "join";
    }

    @RequestMapping("loginPage")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("logout")
    public String logout() {
        return logoutService.logout();
    }
}