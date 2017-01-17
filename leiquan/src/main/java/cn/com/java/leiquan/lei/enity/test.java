package cn.com.java.leiquan.lei.enity;

import cn.com.java.core.baseOperations.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by xiaolei on 2017/1/4.
 */
@Entity
@Table(name="test")
public class test extends BaseEntity implements Serializable{
    @Id
    private String id;

    private String remark;

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getRemark() {

        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
