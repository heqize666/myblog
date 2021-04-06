package com.jg.blog.pojo;

import lombok.Data;

/**
 * @Author: heqize
 * @Date: 2020/2/9 14:45
 * @Version 1.0
 */
@Data
public class Music {

    private Integer id;
    private String name;
    private String artist;
    private String url;
    private String cover;
    private String lrc;
    private String createdTime;
    private Integer enabled;
    private Integer deleted;

}
