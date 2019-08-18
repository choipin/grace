package com.grace.it.service;

import com.grace.it.entity.Dept;
import com.grace.it.entity.DeptManager;
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
public interface DeptManagerService {
    public List<DeptManager> listByCondition(DeptManager deptManager);

    public PageResult<DeptManager> selectByPage(PageVo pageVo);

    public Integer updateByCondition(DeptManager deptManager);

    public Integer insert(DeptManager deptManager);

    public Integer deleteByEmpNo(Long empNo);
}
