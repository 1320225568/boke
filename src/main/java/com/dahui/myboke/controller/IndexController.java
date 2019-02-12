package com.dahui.myboke.controller;

import com.dahui.myboke.common.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 */
@RestController
public class IndexController extends BaseController{
    private Logger logger = LoggerFactory.getLogger(IndexController.class);
    /**
     *
     */
    @RequestMapping(value="/hello" , method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView){
        logger.info("进入了index方法！");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
