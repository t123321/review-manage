package com.object.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.object.mapper.AdminMapper;
import com.object.pojo.Admin;

@Transactional
@Service("adminService")
/**
 * 操作管理员表的业务层
 * @author Administrator
 *
 */
public class AdminServiceImpl {
    
    private AdminMapper adminMapper;

    public AdminMapper getAdminMapper() {
        return adminMapper;
    }
    
    @Autowired
    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public List<Admin> loadAdmin() {
        return adminMapper.queryAll();
    }
    
}
