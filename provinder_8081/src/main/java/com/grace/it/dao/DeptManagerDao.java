package com.grace.it.dao;

import com.grace.it.entity.DeptManager;
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
public interface DeptManagerDao {
    public List<DeptManager> listByCondition(DeptManager deptManager);

    public List<DeptManager> selectByPage(PageVo pageVo);

    public Integer countDeptManager();

    public Integer updateByCondition(DeptManager deptManager);

    public Long insert(DeptManager deptManager);

    public Integer deleteByEmpNo(Long empNo);
}
