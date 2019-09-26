package com.red.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author red
 * @version 1.00
 * @Date 2019/9/23 20:29
 */

@Controller
public class ForeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
