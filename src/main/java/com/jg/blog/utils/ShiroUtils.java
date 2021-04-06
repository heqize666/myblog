package com.jg.blog.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.stereotype.Component;
/**
 * Shiro工具类
 * @Author ：heqize
 * @Date: 2020-12-24
 */
@Component
public class ShiroUtils  {

    private ShiroUtils() {
    }

    /**
     * 获取登录中的用户
     *
     * @return
     */
    public static Object getLoginUser() {
        Session session = SecurityUtils.getSubject().getSession();
        SimplePrincipalCollection principalCollection = (SimplePrincipalCollection) session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
        if (principalCollection == null) {
            return null;
        }
        return principalCollection.getPrimaryPrincipal();
    }
}
