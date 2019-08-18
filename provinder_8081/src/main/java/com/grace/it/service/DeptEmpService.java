package com.grace.it.service;

import com.grace.it.entity.Dept;
import com.grace.it.entity.DeptEmp;
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
public interface DeptEmpService {
    public List<DeptEmp> listByCondition(DeptEmp deptEmp);

    public PageResult<DeptEmp> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(DeptEmp deptEmp);

    public Integer insert(DeptEmp deptEmp);

    public Integer deleteByCondition(Long empNo);
}
