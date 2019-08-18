package com.grace.it.service;

import com.grace.it.entity.Dept;
import com.grace.it.entity.Title;
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
public interface TitleService {
    public List<Title> listByCondition(Title title);

    public PageResult<Title> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(Title title);

    public Integer add(Title title);

    public Integer deleteByEmpNo(Long empNo);
}
