package com.cookChen.controller;

import com.cookChen.model.UserInfo;
import com.cookChen.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    /**
     * 根据用户Id查询名字
     * @param modelMap
     * @param id
     * @return
     */
    @RequestMapping("/showName")
    public String showUserInfo(ModelMap modelMap, @RequestParam(value = "id") Integer id){
        UserInfo userInfo = userInfoService.getUsers(id);
        modelMap.addAttribute("userInfo", userInfo);
        return "/user/showInfo";
    }
}
