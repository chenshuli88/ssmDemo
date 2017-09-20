package com.cookChen.service.impl;

import com.cookChen.dao.UserInfoDao;
import com.cookChen.model.UserInfo;
import com.cookChen.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("userInfoService")
@Transactional
public class UserInfoServiceImpl implements UserInfoService{

    @Resource
    private UserInfoDao userInfoDao;


    public UserInfo getUsers(Integer id) {
        return userInfoDao.selectByPrimaryKey(id);
    }
}
