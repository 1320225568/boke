package com.dahui.myboke.service.impl;

import com.dahui.myboke.bean.User;
import com.dahui.myboke.dao.UserDao;
import com.dahui.myboke.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Pattern;

@Service
public class IndexServiceImpl implements IndexService {


    private static final Logger LOGGER = LoggerFactory.getLogger(IndexServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(User user) {
        LOGGER.info("传递的参数为"+user.getUsername()+user.getPassword());
        boolean falg = userDao.login(user);
        return falg;
    }
}
