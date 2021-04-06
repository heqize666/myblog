package com.jg.blog.mapper;

import com.jg.blog.pojo.Blog;
import com.jg.blog.utils.Page;
import com.jg.blog.vo.BlogVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author heqize
 * @date 2020-12-25
 */
@Component
public interface BlogMapper {

    /**
     * 保存
     * @param blog
     */
    void save(Blog blog);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Blog getById(String id);

    /**
     * 更新
     * @param blog
     */
    void update(Blog blog);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(String id);

    /**
     * 分页查询
     * @param page
     * @return
     */
    List<BlogVo> getByPage(Page<BlogVo> page);

    /**
     * 查询总数
     * @param page
     * @return
     */
    int getCountByPage(Page<BlogVo> page);

    /**
     * 查询推荐阅读
     * @return
     */
    List<BlogVo> recomRead();

    /**
     * 查询时间轴
     * @return
     */
    List<BlogVo> getTimeLine();

    /**
     * 更新点赞量
     * @param blogId
     */
    void updateGoods(String blogId);
}
