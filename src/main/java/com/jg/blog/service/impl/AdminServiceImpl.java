package com.jg.blog.service.impl;

import com.jg.blog.mapper.AdminMapper;
import com.jg.blog.pojo.Admin;
import com.jg.blog.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表服务实现类
 * </p>
 *
 * @author heqize
 * @date 2020-02-07 14:04:12
 * @Version 1.0
 */
@Service
@Slf4j
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     */
    @Override
    public Admin getByUsername(String username) {
        return adminMapper.getByUsername(username);
    }

    @Override
    public Admin getAdmin() {
        return adminMapper.getAdmin();
    }

    @Override
    public void updateInfo(Admin admin) {
        adminMapper.update(admin);
    }

    @Override
    public void updatePassword(Admin admin) {
        Admin oldAdmin = adminMapper.getAdmin();
        oldAdmin.setPassword(admin.getPassword());
        adminMapper.update(oldAdmin);
    }

    @Override
    @Scheduled(fixedRate = 1000)
    public void testS() {
        System.out.println("1");
    }
}
