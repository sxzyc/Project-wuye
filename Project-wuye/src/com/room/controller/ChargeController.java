package com.room.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.room.bean.Charge;
import com.room.service.IChargeService;
import com.room.service.impl.ChargeServiceImpl;

/**
 * @ClassName: ChargeController
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:34:06
 * @param:
 */
@Controller
@RequestMapping("/charge")
public class ChargeController{
	@RequestMapping("/chargeList")
	public String chargeList(Model model) {
		IChargeService chargeService = new ChargeServiceImpl();
			List<Charge> list =  chargeService.findAllCharges();
			model.addAttribute("charges", list);
			return "/charge/charge-list";
		}
		
	
	@RequestMapping("/chargePWD")
	public String chargePWD(){
			return "/charge/charge-add";
		}
	
	
		@RequestMapping("/chargeAdd")
		public String chargeAdd(Charge c,Model model) {
			IChargeService chargeService = new ChargeServiceImpl();
			chargeService.save(c);
			List<Charge> list =  chargeService.findAllCharges();
			model.addAttribute("charges", list);
			return "/charge/charge-list";
		}
		
		@RequestMapping("/findById")
		public String findById(String id,Model model) {
		IChargeService chargeService = new ChargeServiceImpl();
			Charge a = chargeService.findById(id);
			model.addAttribute("charge", a);
			return "/charge/charge-edit";
		}
		
		@RequestMapping("/chargeUpdate")
		public String chargeUpdate(Charge c,Model model) {
		IChargeService chargeService = new ChargeServiceImpl();
			chargeService.update(c);
			List<Charge> list =  chargeService.findAllCharges();
			model.addAttribute("charges", list);
			return "/charge/charge-list";
		}
		
		@RequestMapping("/chargeDelete")
		public String chargeDelete(String id,Model model) {
		IChargeService chargeService = new ChargeServiceImpl();
			chargeService.delete(id);
			List<Charge> list =  chargeService.findAllCharges();
			model.addAttribute("charges", list);
			return "/charge/charge-list";
		}
		
		@RequestMapping("/chargeUserList")
		public String chargeUserList(String username,Model model) {
			IChargeService chargeService = new ChargeServiceImpl();
			List<Charge> list =  chargeService.findByCharge(username);
			model.addAttribute("charges", list);
			return "/charge/user-charge-list";
		}
		
	
	}


