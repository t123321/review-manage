package com.object.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.object.pojo.Admin;
import com.object.service.AdminServiceImpl;

@Controller
@RequestMapping("/AdminController")
/**
 * 登录页面控制器(Controller)
 * @author Administrator
 *
 */
public class LoginController {
	 	private AdminServiceImpl adminService;
	    
	    public AdminServiceImpl getAdminService() {
	        return adminService;
	    }

	    @Autowired
	    public void setAdminService(AdminServiceImpl adminService) {
	        this.adminService = adminService;
	    }

	    @RequestMapping("/showAdmin")
	    public String showPersons(Model model){
	        List<Admin> admin = adminService.loadAdmin();
	        model.addAttribute("admins", admin);
	        return "login";
	    }
}
