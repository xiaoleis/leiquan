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

     @Resource
     private BoService boService1;


    @RequestMapping(value="test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        test test1 = new test();
        test1.setId("200");
        test1.setRemark("测试");
        boService.save(test1);
        System.out.print("测试保存数据----------");
        test test2 = new test();
        test2 = (test)boService1.findOne(test1.getUuid(),test.class);
        System.out.print("查找唯一数据==========="+test2.getUuid());
        test2.setRemark("测试 2");
        boService1.update(test2);
        System.out.print("测试更新数据=======");
        boService1.delete(test2.getUuid(),test.class);
        System.out.print("测试删除数据=======");
        mv.setViewName("/lei/test");
        return mv;
    }

}
