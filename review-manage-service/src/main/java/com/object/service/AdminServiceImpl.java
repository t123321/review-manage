package com.object.service;

import java.io.Serializable;
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
public class AdminServiceImpl extends BaseServiceImpl<Admin> {
	@Autowired
    private AdminMapper adminMapper;

	@Override
	public Admin queryByKey(Serializable id) {
		return super.queryByKey(id);
	}

	@Override
	public List<Admin> queryAll() {
		return super.queryAll();
	}

	@Override
	public void insert(Admin t) {
		super.insert(t);
	}

	@Override
	public void update(Admin t) {
		super.update(t);
	}

	@Override
	public void deleteByKey(Serializable id) {
		super.deleteByKey(id);
	}
	
	/**
	 * 根据登陆名查询管理员
	 * @param adminLoginName 登陆名
	 */
	public Admin queryAdminByLoginName(String adminLoginName) {
		return adminMapper.queryAdminByLoginName(adminLoginName);
	}

}
