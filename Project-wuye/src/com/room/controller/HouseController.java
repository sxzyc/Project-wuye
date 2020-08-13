package com.room.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.room.bean.House;
import com.room.service.IHouseService;
import com.room.service.impl.HouseServiceImpl;

/**
 * @ClassName: HouseController
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:37:59
 * @param:
 */
@Controller
@RequestMapping("/house")
public class HouseController{
	@RequestMapping("/houseList")
	public String houseList(Model model) {
		IHouseService ihs = new HouseServiceImpl();
			List<House> list =  ihs.findAllHouse();
			model.addAttribute("houses", list);
			return "/house/house-list";
		}
	
	@RequestMapping("/housePWD")
	public String housePWD(){
			return "/house/house-add";
		}
	
	@RequestMapping("/houseAdd")
		public String houseAdd(House h,Model model) {
			IHouseService ihs = new HouseServiceImpl();
			ihs.add(h);
			List<House> list =  ihs.findAllHouse();
			model.addAttribute("houses", list);
			return "/house/house-list";
		}
		
	@RequestMapping("/findByOwnerid")
	public String findByOwnerid(String ownerid,Model model) {
		IHouseService ihs = new HouseServiceImpl();
			List<House>  list = ihs.findByOwnerid(ownerid);
			model.addAttribute("houses", list);
			return "/house/user-house-list";
		}
	
	@RequestMapping("/findById")
	public String findById(String id,Model model) {
			IHouseService ihs = new HouseServiceImpl();		
			House h = ihs.findById(id);		
			model.addAttribute("house",h);
			return "/house/house-edit";
			
		}
	
	@RequestMapping("/houseEdit")
	public String houseEdit(House h,Model model) {
			IHouseService ihs = new HouseServiceImpl();
			ihs.update(h);
			List<House> list =  ihs.findAllHouse();
			model.addAttribute("houses", list);
			return "/house/house-list";
		}
	
	@RequestMapping("/houseDelete")
	public String houseDelete(String id,Model model) {
			IHouseService ihs = new HouseServiceImpl();
			ihs.delete(id);
			List<House> list =  ihs.findAllHouse();
			model.addAttribute("houses", list);
			return "/house/house-list";
		}
	
	}
	
