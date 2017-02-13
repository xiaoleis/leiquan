package cn.com.java.core.coreOperations.dao.impl;

import cn.com.java.core.coreOperations.dao.CoreDao;
import cn.com.java.leiquan.lei.enity.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


import javax.annotation.Resource;

/**
 * Created by xiaolei on 2017/1/6.
 */
@Repository("coreDao")
public class CoreDaoImpl implements CoreDao {

    @Resource
    private SessionFactory sessionFactory;

    protected Session getSession(){

        return sessionFactory.getCurrentSession();
    }

    /**
     * 基础save方法
     * @param t
     */
    public void save(final Object t) {

        getSession().save(t);
    }

    /**
     * 基础update方法
     * @param t
     */
    public void update(final Object t){
        System.out.print("-0000");
        getSession().update(t);
    }

    /**
     * 根据uuid查询唯一数据
     * @param uuid
     * @param T
     * @return
     */
    public Object findOne(String uuid, Class T) {

        return getSession().get(T,uuid);
}

    /**
     * 根据uuid删除数据
     * @param uuid
     * @param T
     */
    public void delete(String uuid, Class T) {
        Object object =  findOne(uuid,T);
        if(object != null){
            getSession().delete(object);
        }

    }

}
