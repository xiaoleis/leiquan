package cn.com.java.core.baseOperations.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xiaolei on 2017/1/11.
 */

/**
 * 实体基础类
 */
@MappedSuperclass
public class BaseEntity {

    //uuid 唯一主键
    @Id
    @Column(length = 32,name = "UUID", nullable = false)
    public String uuid;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, name = "CJSJ")
    public Date cjsj;

    /**
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, name = "XGSJ")
    public Date xgsj;

    /**
     * 创建人
     */
    @Column(nullable = true, name = "CJR",length = 32)
    public String  cjr;

    /**
     * 修改人
     */
    @Column(nullable = true, name = "XGR",length = 32)
    public String xgr;

    public String getUuid() {
        return uuid;
    }


    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Date getXgsj() {
        return xgsj;
    }

    public void setXgsj(Date xggsj) {
        this.xgsj = xggsj;
    }

    public String getCjr() {
        return cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr;
    }

    public String getXgr() {
        return xgr;
    }

    public void setXgr(String xgr) {
        this.xgr = xgr;
    }
}
