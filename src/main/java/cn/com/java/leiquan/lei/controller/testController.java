package cn.com.java.leiquan.lei.controller;

import cn.com.java.core.baseOperations.service.BoService;
import cn.com.java.core.coreOperations.service.CoreService;
import cn.com.java.core.genericOperations.controller.AbstractGenericController;
import cn.com.java.leiquan.lei.enity.test;

import org.aspectj.weaver.ast.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


/**
 * Created by xiaolei on 2017/1/4.
 */
@Controller
@RequestMapping(value="/main")
public class testController extends AbstractGenericController<test>{

    // @Resource
    // private BoService boService;


    @RequestMapping(value="test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        test test = new test();
        test.setId("200");
        test.setRemark("测试");
        boService.save(test);
        System.out.print("----------");
        mv.setViewName("/lei/test");
        return mv;
    }

}
