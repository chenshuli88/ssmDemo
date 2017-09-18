package com.cookChen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    /**
     * 去第一页
     *
     * @return
     */
    @RequestMapping("/toPageOne")
    public ModelAndView toPageone() {
        return new ModelAndView("pageOne");
    }
}
