package com.grace.it.dao;

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
    public List<DeptManagerDao> listByCondition(DeptManagerDao deptManager);

    public List<DeptManagerDao> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(DeptManagerDao deptManager);

    public Long insert(DeptManagerDao deptManager);
}
