package com.dong.ch09.server;

import com.dong.ch09.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class UserServer {
//    @Qualifier("userDao1")
    // @Resource
    // resource not support primary
    // resource not support required
    @Autowired
    // @Inject
    // inject support primary
    // inject not support required
    private UserDao userDao1;

    public void printUserDao() {
        System.out.println(userDao1);
    }
}
