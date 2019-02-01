package com.object.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.object.pojo.Admin;
import com.object.service.AdminServiceImpl;

@RestController
@RequestMapping("/LoginController")
/**
 * 登录页面控制器(Controller)
 * @author LoginController
 *
 */
public class LoginController {
		@Autowired
	 	private AdminServiceImpl adminService;
	    
	    @RequestMapping()
	    public String showLogin(){
	        return "login";
	    }

	    @RequestMapping("/findAdminByName")
	    public Admin findAdminByName(String adminLoginName){
	        Admin admin = adminService.queryAdminByLoginName(adminLoginName);
	        return admin;
	    }
	    
	    @RequestMapping("/findUserAll")
	    public List<Admin> findAdminAll(){
	        List<Admin> adminList = adminService.queryAll();
	        return adminList;
	    }
}
