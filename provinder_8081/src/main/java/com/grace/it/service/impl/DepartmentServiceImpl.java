package com.grace.it.service.impl;

import com.grace.it.dao.DepartmentDao;
import com.grace.it.entity.Department;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public List<Department> listByCondition(Department department) {
        return departmentDao.listByCondition(department);
    }

    @Override
    public PageResult<Department> selectTitleByPage(PageVo pageVo) {
        List<Department> list = departmentDao.selectTitleByPage(pageVo);
        Integer count = departmentDao.count();
        return new PageResult<Department>().setRows(list).setTotal(count);
    }

    @Override
    public Integer updateByCondition(Department department) {
        return departmentDao.updateByCondition(department);
    }

    @Transactional
    @Override
    public Integer insert(Department department) {
        return departmentDao.insert(department);
    }

    @Override
    public Integer delete(String deptNo) {
        return departmentDao.deteleByCondition(deptNo);
    }
}
