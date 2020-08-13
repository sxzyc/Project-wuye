package com.room.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.room.bean.Admin;
import com.room.service.IAdminService;
import com.room.service.impl.AdminServiceImpl;
import com.room.util.MD5Util;

/**
 * @ClassName: AdminController
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:28:33
 * @param:
 */
@Controller
@RequestMapping("/admin")
public class AdminController{
	@RequestMapping("/adminList")
	public String adminList(Model model){
		IAdminService adminService = new AdminServiceImpl();
			List<Admin> list =  adminService.findAlladmins();
			model.addAttribute("Aadmins", list);
			return "/admin/admin-list";
		}
	
	@RequestMapping("/adminPWD")
	public String adminPWD(){
			return "/admin/admin-add";
		}
	
	@RequestMapping("/adminAdd")
	public String adminAdd(Admin admin,Model model){
		IAdminService adminService = new AdminServiceImpl();
			admin.setPassword(MD5Util.encode(admin.getPassword()));
			adminService.save(admin);
			List<Admin> list =  adminService.findAlladmins();
			model.addAttribute("Aadmins", list);
			return "/admin/admin-list";
		}
	
	@RequestMapping("/findById")
	public String findById(String id,Model model){
		IAdminService adminService = new AdminServiceImpl();
			Admin a = adminService.findById(id);
			model.addAttribute("adminOne", a);
			return "/admin/admin-edit";
		}
	
	@RequestMapping("/adminEdit")
	public String adminEdit(Admin admin,Model model){
		IAdminService adminService = new AdminServiceImpl();
			admin.setPassword(MD5Util.encode(admin.getPassword()));
			adminService.update(admin);
			List<Admin> list =  adminService.findAlladmins();
			model.addAttribute("Aadmins", list);
			return "/admin/admin-list";
		}
	
	@RequestMapping("/adminDelete")
	public String adminDelete(String id, Model model) {
		IAdminService adminService = new AdminServiceImpl();
			adminService.delete(id);
			List<Admin> list =  adminService.findAlladmins();
			model.addAttribute("Aadmins", list);
			return "/admin/admin-list";
		}
	
	@RequestMapping("/change")
	public void change(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IAdminService adminService = new AdminServiceImpl();
			String id = request.getParameter("id");
			Admin a = adminService.findById(id);
			request.setAttribute("admin", a);
			RequestDispatcher rd = request.getRequestDispatcher("adminChange.jsp");
			rd.forward(request, response);
		}
	}


