package com.junki.onlinetalk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author junki
 * @date 2020/5/15 15:53
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "chatRoom";
    }

}
