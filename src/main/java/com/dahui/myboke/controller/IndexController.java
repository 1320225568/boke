package com.dahui.myboke.controller;

import com.dahui.myboke.common.BaseController;
import com.dahui.myboke.bean.User;
import com.dahui.myboke.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


/**
 *
 */
@RestController
public class IndexController extends BaseController{
    private Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IndexService indexService;
    /**
     * 从后台进入到博客首页面
     */
    @RequestMapping(value="/index" , method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView){
        LOGGER.info("进入了index方法！");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /**
     * login登录
     */
    @RequestMapping(value = "/banner/login" , method = RequestMethod.POST)
    public Map<String,String> login(User user){
        LOGGER.info("进入logger方法！");
        Map<String,String> map = new HashMap<String,String>();
        //判断user的值是否为null
        if(user != null ){
            if(StringUtils.isEmpty(user.getUsername())){
                map.put("error","用户名不能为空");
                return map;
            }
            if(StringUtils.isEmpty(user.getPassword())){
                map.put("error","密码不能为空");
                return map;
            }
        }else{
            map.put("error","登录参数为空");
            return map;
        }
        boolean falg = indexService.login(user);
        if(falg){
            map.put("success","登录成功");
        }else{
            map.put("error","用户名或密码错误");
        }
        LOGGER.info("执行成功！");
        return map;
    }
}
