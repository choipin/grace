package com.grace.it.dao;

import com.grace.it.entity.Department;
import com.grace.it.entity.DeptEmp;
import com.grace.it.model.PageVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@Mapper
@Component
public interface DepartmentDao {
    public List<Department> listByCondition(Department department);

    public List<Department> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(Department department);

    public Integer insert(Department department);

    public Integer deteleByCondition(String deptNo);

    public Integer count();
}
