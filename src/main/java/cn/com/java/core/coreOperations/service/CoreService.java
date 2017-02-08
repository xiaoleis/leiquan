package cn.com.java.core.coreOperations.service;

/**
 * Created by xiaolei on 2017/1/6.
 * @param  核心常用方法
 */

public interface CoreService {


    /**
     * save方法
     * @param t
     */
    void save(final Object t);

    /**
     * 根据uuid查找唯一数据对象
     * @param uuid
     * @param T
     * @return
     */
    Object findOne(String uuid, Class T);

    /**
     * 根据uuid删除唯一数据
     * @param uuid
     * @param T
     */
    void delete(String uuid, Class T);

    /**
     * update方法
     * @param t
     */
    void update(final Object t);

}
