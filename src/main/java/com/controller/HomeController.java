package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengbw on 2019/6/19.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post() {
        return home();
    }
}
