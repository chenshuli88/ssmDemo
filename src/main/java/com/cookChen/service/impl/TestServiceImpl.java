package com.cookChen.service.impl;

import com.cookChen.dao.TestDao;
import com.cookChen.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("TestService")
@Transactional
public class TestServiceImpl implements TestService{

    @Resource
    private TestDao testDao;

    public void test() {
        System.out.println("I'm service");
        testDao.test();
    }
}
