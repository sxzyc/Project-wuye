package com.room.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.room.bean.Inspection;
import com.room.service.IInspectionService;
import com.room.service.impl.InspectionServiceImpl;

/**
 * @ClassName: InspectionController
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:38:41
 * @param:
 */
@Controller
@RequestMapping("/inspection")
public class InspectionController{
	@RequestMapping("/inspectionList")
	public String inspectionList(Model model){
		IInspectionService iis = new InspectionServiceImpl();
			List<Inspection> list =  iis.findAllinspections();
			model.addAttribute("inspections", list);
			return "/inspection/inspection-list";
		}
	
	
	@RequestMapping("/inspectionPWD")
	public String inspectionPWD(){
			return "/inspection/inspection-add";
		}
		
	@RequestMapping("/inspectionAdd")
	public String inspectionAdd(Inspection i,Model model){
		IInspectionService iis = new InspectionServiceImpl();
			iis.save(i);
			List<Inspection> list =  iis.findAllinspections();
			model.addAttribute("inspections", list);
			return "/inspection/inspection-list";
		}
	
	@RequestMapping("/findById")
	public String findById(String id,Model model){
		IInspectionService iis = new InspectionServiceImpl();
			Inspection i = iis.findById(id);
			model.addAttribute("inspection", i);
			return "/inspection/inspection-edit";
		}
	
	@RequestMapping("/inspectionEdit")
	public String inspectionEdit(Inspection i,Model model){
		IInspectionService iis = new InspectionServiceImpl();
			iis.update(i);
			List<Inspection> list =  iis.findAllinspections();
			model.addAttribute("inspections", list);
			return "/inspection/inspection-list";
		}
	
	@RequestMapping("/inspectionDelete")
	public String inspectionDelete(String id,Model model) {
		IInspectionService iis = new InspectionServiceImpl();
			iis.delete(id);
			List<Inspection> list =  iis.findAllinspections();
			model.addAttribute("inspections", list);
			return "/inspection/inspection-list";
		}
	}

