package com.jg.blog.service;

import com.jg.blog.pojo.Link;

import java.util.List;

/**
 * @Author: heqize
 * @Date: 2020/12/27
 */
public interface LinkService {

    /**
     * 添加
     * @param link
     */
    void save(Link link);

    /**
     * 修改
     * @param link
     */
    void update(Link link);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Link getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Link> getAll();

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(Integer id);
}
