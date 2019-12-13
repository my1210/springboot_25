package com.aaa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @version v1.0
 * @ProjectName: springboot_13
 * @ClassName: Dept
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2019-11-27 17:58
 */
@Entity
@Table(name="dept")
public class Dept {
    @Id
    private Integer deptId;
    private String deptName;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
