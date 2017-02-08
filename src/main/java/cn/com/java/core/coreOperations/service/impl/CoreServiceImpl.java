package cn.com.java.core.coreOperations.service.impl;

import cn.com.java.core.coreOperations.dao.CoreDao;
import cn.com.java.core.coreOperations.service.CoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiaolei on 2017/1/6.
 */
@Service("coreService")
public class CoreServiceImpl implements CoreService {

    @Resource
    private CoreDao coreDao;

    public CoreServiceImpl() {
    }

    public void save(final Object t) {

        coreDao.save(t);
    }


    public Object findOne(String uuid,Class T){

        return coreDao.findOne(uuid, T);
    }


    public void delete(String uuid , Class T){

        coreDao.delete(uuid, T);
    }

    public void update(final Object t){

        coreDao.update(t);
    }

}
