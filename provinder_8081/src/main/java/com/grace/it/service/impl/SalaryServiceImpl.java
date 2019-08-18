package com.grace.it.service.impl;

import com.grace.it.dao.SalaryDao;
import com.grace.it.entity.Salary;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.SalaryService;
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
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryDao salaryDao;

    @Override
    public List<Salary> listByCondition(Salary salary) {
        return salaryDao.listByCondition(salary);
    }

    @Override
    public PageResult<Salary> selectTitleByPage(PageVo pageVo) {
        List<Salary> rows = salaryDao.selectByPage(pageVo);
        Integer total = salaryDao.countSalary();
        return new PageResult<Salary>().setRows(rows).setTotal(total);
    }

    @Transactional
    @Override
    public Integer updateByCondition(Salary salary) {
        return salaryDao.updateByCondition(salary);
    }

    @Transactional
    @Override
    public Integer insert(Salary salary) {
        return salaryDao.insert(salary);
    }

    @Transactional
    @Override
    public Integer deleteByEmpNo(Long dempNo) {
        return salaryDao.deleteByEmpNo(dempNo);
    }
}
