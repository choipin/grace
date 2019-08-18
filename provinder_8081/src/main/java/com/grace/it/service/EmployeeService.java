package com.grace.it.service;

import com.grace.it.entity.Dept;
import com.grace.it.entity.Employee;
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
public interface EmployeeService {
    public List<Employee> listByCondition(Employee employee);

    public List<Employee> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(Employee employee);

    public Integer insert(Employee employee);

    public Integer deleteByEmpNo(Long empNo);
}
