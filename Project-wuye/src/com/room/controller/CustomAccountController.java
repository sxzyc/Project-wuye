package com.room.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.room.bean.CustomAccount;
import com.room.service.ICustomAccountService;
import com.room.service.impl.CustomAccountServiceImpl;
import com.room.util.MD5Util;

/**
 * @ClassName: CustomAccountController
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:36:37
 * @param:
 */
@Controller
@RequestMapping("/customAccount")
public class CustomAccountController{
	@RequestMapping("/customAccountList")
	public String customAccountList(Model model) {
		ICustomAccountService ca = new CustomAccountServiceImpl();
			List<CustomAccount> list =  ca.findAllcustomAccount();
			model.addAttribute("customAccounts", list);
			return "/customAccount/custom-list";
		}
	
	@RequestMapping("/customPWD")
	public String maintainPWD(){
			return "/customAccount/custom-add";
		}
	
		@RequestMapping("/customAccountAdd")
		public String customAccountAdd(CustomAccount c,Model model){
			ICustomAccountService ca = new CustomAccountServiceImpl();
			c.setPassword(MD5Util.encode(c.getPassword()));
			ca.save(c);
			List<CustomAccount> list =  ca.findAllcustomAccount();
			model.addAttribute("customAccounts", list);
			return "/customAccount/custom-list";
		}
		
		@RequestMapping("/findById")
		public String findById(String accountid,Model model) {
			ICustomAccountService ca = new CustomAccountServiceImpl();
			CustomAccount c = ca.findById(accountid);
			model.addAttribute("customAccount", c);
			return "/customAccount/custom-edit";
		}
		
		@RequestMapping("/findById2")
		public String findById2(String accountid,Model model) {
			ICustomAccountService ca = new CustomAccountServiceImpl();
			CustomAccount c = ca.findById(accountid);
			model.addAttribute("customAccount", c);
			return "/customAccount/user-custom-list";
		}
		
		@RequestMapping("/customAccountEdit")
		public String customAccountEdit(CustomAccount c,Model model) {
			ICustomAccountService ca = new CustomAccountServiceImpl();
			c.setPassword(MD5Util.encode(c.getPassword()));
			ca.update(c);
			List<CustomAccount> list =  ca.findAllcustomAccount();
			model.addAttribute("customAccounts", list);
			return "/customAccount/custom-list";
		}
		
		@RequestMapping("/customAccountDelete")
		public String customAccountDelete(String accountid,Model model) {
			ICustomAccountService ca = new CustomAccountServiceImpl();
			ca.delete(accountid);
			List<CustomAccount> list =  ca.findAllcustomAccount();
			model.addAttribute("customAccounts", list);
			return "/customAccount/custom-list";
		}
		
		@RequestMapping("/change")
		public String change(String accountid,Model model) {
			ICustomAccountService ca = new CustomAccountServiceImpl();
			CustomAccount c = ca.findById(accountid);
			model.addAttribute("customAccount", c);
			return "/customAccount/user-change-passwd";
		}
		
		@RequestMapping("/customAccountUserEdit")
		public String customAccountUserEdit(CustomAccount c) {
			ICustomAccountService ca = new CustomAccountServiceImpl();
			c.setPassword(MD5Util.encode(c.getPassword()));
			ca.update(c);
			//response.sendRedirect("findById2?accountid="+accountid);
			return "forward:/customAccount/findById2?accountid="+c.getAccountid();
		}
	}

