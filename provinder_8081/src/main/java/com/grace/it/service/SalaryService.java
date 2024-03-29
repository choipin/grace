package com.grace.it.service;

import com.grace.it.entity.Dept;
import com.grace.it.entity.Salary;
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
public interface SalaryService {
    public List<Salary> listByCondition(Salary salary);

    public PageResult<Salary> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(Salary salary);

    public Integer insert(Salary salary);

    public Integer deleteByEmpNo(Long dempNo);
}
