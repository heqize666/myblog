package com.jg.blog.service;

import com.jg.blog.pojo.Music;
import com.jg.blog.utils.Page;

import java.util.List;

/**
 * @Author: heqize
 * @Date: 2020/12/27
 */
public interface MusicService {

    /**
     * 保存
     * @param music
     */
    void save(Music music);

    /**
     * 更新
     * @param music
     */
    void update(Music music);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Music getById(Integer id);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 启用
     * @param id
     */
    void enableById(Integer id);

    /**
     * 弃用
     * @param id
     */
    void disableById(Integer id);

    /**
     * 分页
     * @param page
     * @return
     */
    Page<Music> getByPage(Page<Music> page);

    /**
     * 前台查询
     * @return
     */
    List<Music> getList();
}
