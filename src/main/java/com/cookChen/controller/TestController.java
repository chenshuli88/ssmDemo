package com.cookChen.controller;

import com.cookChen.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 去第一页
     *
     * @return
     */
    @RequestMapping("/toPageOne")
    public ModelAndView toPageOne() {
        System.out.println("I'm controller");
        testService.test();
        return new ModelAndView("pageOne");
    }
}
