package com.room.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.room.bean.Admin;
import com.room.bean.CustomAccount;
import com.room.service.IAdminService;
import com.room.service.ICustomAccountService;
import com.room.service.impl.AdminServiceImpl;
import com.room.service.impl.CustomAccountServiceImpl;
import com.room.util.MD5Util;

/**
 * @ClassName: UserController
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:40:52
 * @param:
 */
@Controller
@RequestMapping("/user")
public class UserController extends HttpServlet{
	
	@RequestMapping("/login")
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		IAdminService as = new AdminServiceImpl();
		ICustomAccountService cs = new CustomAccountServiceImpl();
		HttpSession session = request.getSession();

			String name = request.getParameter("username");
			String password = MD5Util.encode(request.getParameter("password"));
			String usertype = request.getParameter("usertype");
			Admin a = as.findBynp(name, password);
			CustomAccount c = cs.findBynp(name, password);
			
			if("admin".equals(usertype) && a != null) {
				String n = a.getName();
				String p = a.getPassword();
				if(n.equals(name) && p.equals(password)) {
					session.setAttribute("admin", a);
					response.sendRedirect("../index.jsp");
				}else {
					response.getWriter().write("<script charset='UTF-8'>alert(\"用户名或密码错误！\");" +
	                        "location.href='../login.jsp';</script>");
				}
			}else if("user".equals(usertype) && c != null) {
				String n = c.getUsername();
				String p = c.getPassword();
				if(n.equals(name) && p.equals(password)) {
					session.setAttribute("customAccount", c);
					response.sendRedirect("../indexUser.jsp");
				}else {
					response.getWriter().write("<script charset='UTF-8'>alert(\"用户名或密码错误！\");" +
	                        "location.href='../login.jsp';</script>");
				}
			}else{
				response.getWriter().write("<script charset='UTF-8'>alert(\"用户名或密码错误！\");" +
                        "location.href='../login.jsp';</script>");
			}
			
			
	}
	
	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
				session.invalidate();
				response.sendRedirect("../login.jsp");
		}
	@RequestMapping("/relogin")
	public void relogin(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
			HttpSession session = request.getSession();
				session.invalidate();
				response.sendRedirect("../login.jsp");
		}

	
}

		
