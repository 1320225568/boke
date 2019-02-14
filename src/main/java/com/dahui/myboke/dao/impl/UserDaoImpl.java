package com.dahui.myboke.dao.impl;

import com.dahui.myboke.bean.User;
import com.dahui.myboke.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDao.class);

    @Override
    public boolean login(User user) {
        boolean flag = false;
        if(StringUtils.pathEquals("admin",user.getUsername())&&StringUtils.pathEquals("admin123",user.getPassword())){
            LOGGER.info("登录成功！用户名为:"+user.getUsername()+"密码为："+user.getPassword());
            flag = true;
        }
        return flag;
    }
}
