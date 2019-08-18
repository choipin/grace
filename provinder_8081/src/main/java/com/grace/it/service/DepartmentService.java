package com.grace.it.service;

import com.grace.it.entity.Department;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;

import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
public interface DepartmentService {
    public List<Department> listByCondition(Department department);

    public PageResult<Department> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(Department department);

    public Integer insert(Department department);

    public Integer delete(String deptNo);
}
