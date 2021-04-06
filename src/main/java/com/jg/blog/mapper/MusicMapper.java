package com.jg.blog.mapper;

import com.jg.blog.pojo.Music;
import com.jg.blog.utils.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: heqize
 * @Date: 2020/12/27
 */
@Component
public interface MusicMapper {

    /**
     * 添加
     * @param music
     */
    void save(Music music);

    /**
     * 修改
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
     * 分页查询
     * @param page
     * @return
     */
    List<Music> getByPage(Page<Music> page);

    /**
     * 查询总数
     * @param page
     * @return
     */
    int getCountByPage(Page<Music> page);

    /**
     * 前台查询
     * @return
     */
    List<Music> getList();
}
