package com.grace.it.service.impl;

import com.grace.it.dao.DeptEmpDao;
import com.grace.it.entity.DeptEmp;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.DeptEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class DeptEmpServiceImpl implements DeptEmpService {

    @Autowired
    private DeptEmpDao deptEmpDao;
    @Override
    public List<DeptEmp> listByCondition(DeptEmp deptEmp) {
        return deptEmpDao.listByCondition(deptEmp);
    }

    @Override
    public PageResult<DeptEmp> selectTitleByPage(PageVo pageVo) {
        List<DeptEmp> rows = deptEmpDao.selectTitleByPage(pageVo);
        Integer total = deptEmpDao.countRows();
        return new PageResult<DeptEmp>().setTotal(total).setRows(rows);
    }

    @Override
    public Integer updateByCondition(DeptEmp deptEmp) {
        return deptEmpDao.updateByCondition(deptEmp);
    }

    @Override
    public Integer insert(DeptEmp deptEmp) {
        return deptEmpDao.updateByCondition(deptEmp);
    }

    @Override
    public Integer deleteByCondition(Long empNo) {
        return deptEmpDao.deleteByCondition(empNo);
    }
}
