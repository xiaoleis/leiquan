package cn.com.java.core.coreOperations.dao;

/**
 * Created by xiaolei on 2017/1/6.
 */
public interface CoreDao {

    void save(final Object t);

    Object findOne(String uuid, Class T);

    void delete(String uuid, Class T);

    void update(final Object t);

}
