package cn.com.java.core.genericOperations.controller;

/**
 * Created by xiaolei on 2017/1/12.
 */

import cn.com.java.core.baseOperations.service.BoService;

import javax.annotation.Resource;

/**
 * 通用控制类
 *
 */
public abstract class AbstractGenericController<T> {

    @Resource
    public BoService boService;

    /**
     * 抽象类save方法
     * @param t
     */
    protected  void  save(T t){
        boService.save(t);
    }


}
