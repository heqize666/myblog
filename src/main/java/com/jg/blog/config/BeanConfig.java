package com.jg.blog.config;

import com.jg.blog.utils.IdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ：heqize
 * @Date: 2020-12-25
 */
@Configuration
public class BeanConfig {

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }

}
