package com.zl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jacky on 2016/9/21.
 */
@Controller
public class IndexController {

    @RequestMapping("/temp")
    public String temp(){
        return "temp";
    }
}
