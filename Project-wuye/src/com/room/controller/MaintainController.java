package com.room.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.room.bean.Maintain;
import com.room.service.IMaintainService;
import com.room.service.impl.MaintainServiceImpl;

/**
 * @ClassName: MaintainController
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:39:25
 * @param:
 */
@Controller
@RequestMapping("/maintain")
public class MaintainController{
	@RequestMapping("/maintainList")
	public String maintainList(Model model){
		IMaintainService maintainService = new MaintainServiceImpl();
			List<Maintain> list =  maintainService.findAllMaintains();
			model.addAttribute("maintains", list);
			return "/maintain/maintain-list";
		}
		
		@RequestMapping("/maintainPWD")
		public String maintainPWD(){
				return "/maintain/maintain-add";
			}
	
		@RequestMapping("/maintainAdd")
		public String maintainAdd(Maintain m, Model model){
			IMaintainService maintainService = new MaintainServiceImpl();
			maintainService.save(m);
			List<Maintain> list =  maintainService.findAllMaintains();
			model.addAttribute("maintains", list);
			return "/maintain/maintain-list";
		}
		
		@RequestMapping("/findById")
		public String findById(String id,Model model){
			IMaintainService maintainService = new MaintainServiceImpl();
			Maintain m=maintainService.findById(id);
			model.addAttribute("maintain", m);
			return "/maintain/maintain-edit";
		}
		
		@RequestMapping("/maintainUpdate")
		public String maintainUpdate(Maintain m, Model model){
			IMaintainService maintainService = new MaintainServiceImpl();
			maintainService.update(m);
			List<Maintain> list =  maintainService.findAllMaintains();
			model.addAttribute("maintains", list);
			return "/maintain/maintain-list";
		}
		
		@RequestMapping("/maintainDelete")
		public String maintainDelete(String id, Model model){
			IMaintainService maintainService = new MaintainServiceImpl();
			maintainService.delete(id);
			List<Maintain> list =  maintainService.findAllMaintains();
			model.addAttribute("maintains", list);
			return "/maintain/maintain-list";
		}
		
		
		@RequestMapping("/maintainUserList")
		public String maintainUserList(String username,Model model) {
			IMaintainService maintainService = new MaintainServiceImpl();
			List<Maintain> list =  maintainService.findByMaintainer(username);
			model.addAttribute("maintains", list);
			return "/maintain/user-maintain-list";
		}
		
		
		@RequestMapping("/maintainUserPWD")
		public String maintainUserPWD(){
				return "/maintain/user-maintain-add";
			}
		
		
		@RequestMapping("/maintainUserAdd")
		public String maintainUserAdd(Maintain m){
			IMaintainService maintainService = new MaintainServiceImpl();
			maintainService.save(m);
			//response.sendRedirect("maintainUserList?username="+URLEncoder.encode(maintainer,"utf-8"));
			return "forward:/maintain/maintainUserList?username="+m.getMaintainer();
		}
		
		
		@RequestMapping("/maintainUserDelete")
		public String maintainUserDelete(String id,String maintainer) {
			IMaintainService maintainService = new MaintainServiceImpl();
			maintainService.delete(id);
			//response.sendRedirect("maintainUserList?username="+URLEncoder.encode(maintainer,"utf-8"));
			return "forward:/maintain/maintainUserList?username="+maintainer;
		}
	
	}


