package com.object.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.object.pojo.Admin;
import com.object.service.AdminServiceImpl;

@Controller
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

	    @ResponseBody
	    @RequestMapping("/showAdmin")
	    public List<Admin> showAdmin(){
	        List<Admin> admin = adminService.loadAdmin();
	        return admin;
	    }
}
