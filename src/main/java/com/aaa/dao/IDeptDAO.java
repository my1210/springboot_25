package com.aaa.dao;

import com.aaa.entity.Dept;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @version v1.0
 * @ProjectName: springboot_13
 * @ClassName: IDeptDAO
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2019-11-27 17:59
 */
@Repository
public interface IDeptDAO extends Mapper<Dept> {
    Dept findById(Integer deptId);
}
