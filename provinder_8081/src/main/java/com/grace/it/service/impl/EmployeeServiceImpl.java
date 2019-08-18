package com.grace.it.service.impl;

import com.grace.it.dao.EmployeeDao;
import com.grace.it.entity.Employee;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/18
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> listByCondition(Employee employee) {
        return employeeDao.listByCondition(employee);
    }

    @Override
    public PageResult<Employee> selectByPage(PageVo pageVo) {
        List<Employee> rows = employeeDao.selectByPage(pageVo);
        Integer total = employeeDao.countEmployee();
        return new PageResult<Employee>().setTotal(total).setRows(rows);
    }

    @Transactional
    @Override
    public Integer updateByCondition(Employee employee) {
        return employeeDao.updateByCondition(employee);
    }

    @Transactional
    @Override
    public Long insert(Employee employee) {
        return employeeDao.insert(employee);
    }

    @Transactional
    @Override
    public Integer deleteByEmpNo(Long empNo) {
        return employeeDao.deleteByEmpNo(empNo);
    }
}
