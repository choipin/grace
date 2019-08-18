package com.grace.it.dao;

import com.grace.it.entity.Employee;
import com.grace.it.entity.Title;
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
public interface EmployeeDao {
    public List<Employee> listByCondition(Employee employee);

    public List<Employee> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(Employee employee);

    public Long insert(Employee employee);
}
