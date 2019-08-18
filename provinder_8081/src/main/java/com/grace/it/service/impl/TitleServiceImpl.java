package com.grace.it.service.impl;

import com.grace.it.dao.TitleDao;
import com.grace.it.entity.Title;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.border.TitledBorder;
import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/18
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleDao titleDao;
    @Override
    public List<Title> listByCondition(Title title) {
        return titleDao.listByCondition(title);
    }

    @Override
    public PageResult<Title> selectTitleByPage(PageVo pageVo) {
        List<Title> rows = titleDao.selectTitleByPage(pageVo);
        Integer total = titleDao.countTitle();
        return new PageResult<Title>().setTotal(total).setRows(rows);
    }

    @Transactional
    @Override
    public Integer updateByCondition(Title title) {
        return titleDao.updateByCondition(title);
    }

    @Transactional
    @Override
    public Integer add(Title title) {
        return titleDao.insert(title);
    }

    @Transactional
    @Override
    public Integer deleteByEmpNo(Long empNo) {
        return titleDao.deleteByEmpNo(empNo);
    }
}
