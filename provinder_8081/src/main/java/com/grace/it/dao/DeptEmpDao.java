package com.grace.it.dao;

import com.grace.it.entity.DeptEmp;
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
public interface DeptEmpDao {
    public List<DeptEmp> listByCondition(DeptEmp deptEmp);

    public List<DeptEmp> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(DeptEmp deptEmp);

    public Integer insert(DeptEmp deptEmp);

    public Integer countRows();

    public Integer deleteByCondition(Long empNo);
}
