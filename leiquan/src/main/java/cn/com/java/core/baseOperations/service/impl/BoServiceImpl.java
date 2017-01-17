package cn.com.java.core.baseOperations.service.impl;

import cn.com.java.core.baseOperations.entity.BaseEntity;
import cn.com.java.core.baseOperations.service.BoService;
import cn.com.java.core.coreOperations.service.CoreService;
import cn.com.java.core.util.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

/**
 * Created by xiaolei on 2017/1/11.
 */
@Service(value="boService")
public class BoServiceImpl implements BoService {

    @Resource
    private CoreService coreService;

    /**
     * 获取唯一uuid  length=32
     * @return String
     */
    public String getUUID(){

        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 通用save方法接口
     * @param t
     */
    public final void save(final Object t) {
        Validation.objectIsNull(t);
        BaseEntity model = (BaseEntity) t;
        model.setUuid(getUUID());
        model.setCjsj(new Date());
        model.setCjr("");
        coreService.save(t);
    }
}
