package com.dong.spring.ch09;

import com.dong.spring.ch09.config.MainConfig09;
import com.dong.spring.ch09.dao.UserDao;
import com.dong.spring.ch09.server.UserServer;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test09 {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig09.class);
        UserDao userDao = (UserDao) ac.getBean(UserDao.class);
        System.out.println(userDao);
        UserServer userServer = ac.getBean(UserServer.class);
        userServer.printUserDao();
        ac.close();
    }

}
