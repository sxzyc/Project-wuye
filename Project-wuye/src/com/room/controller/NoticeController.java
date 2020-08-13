package com.room.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.room.bean.Notice;
import com.room.service.INoticeService;
import com.room.service.impl.NoticeServiceImpl;

/**
 * @ClassName: NoticeController
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:40:15
 * @param:
 */
@Controller
@RequestMapping("/notice")
public class NoticeController{
	@RequestMapping("/noticelist")
	public  String noticelist(Model model){
		INoticeService noticeservice=new NoticeServiceImpl();
			List<Notice> list=new ArrayList<Notice>();
			list=noticeservice.FindAll();
			model.addAttribute("notice", list);
			return "/notice/notice-list";
		}
		
	@RequestMapping("/noticePWD")
	public String noticePWD(){
			return "/notice/notice-add";
		}
	
		@RequestMapping("/noticeadd")
		public String noticeadd(Notice n,Model model){
			INoticeService noticeservice=new NoticeServiceImpl();
			noticeservice.Add(n);
			List<Notice> list=noticeservice.FindAll();
			model.addAttribute("notice", list);
			return "/notice/notice-list";
		}
		
		@RequestMapping("/noticedelete")
		public String noticedelete(String id,Model model){
			INoticeService noticeservice=new NoticeServiceImpl();
			noticeservice.Delete(id);
			List<Notice> list=noticeservice.FindAll();
			model.addAttribute("notice", list);
			return "/notice/notice-list";
		}
		
		
		@RequestMapping("/noticeselect")
		public String noticeselect(String id,Model model){
			INoticeService noticeservice=new NoticeServiceImpl();
			Notice n=noticeservice.Select(id);
            model.addAttribute("notice", n);
            return "/notice/notice-edit";
		}
		
		
		@RequestMapping("/noticeedit")
		public String noticeedit(Notice n,Model model){
			INoticeService noticeservice=new NoticeServiceImpl();
			noticeservice.Update(n);
			List<Notice> list=noticeservice.FindAll();
			model.addAttribute("notice", list);
			return "/notice/notice-list";
		}
		
		@RequestMapping("/noticeview")
		public String noticeview(String id,Model model) {
			INoticeService noticeservice=new NoticeServiceImpl();
			Notice n=noticeservice.Select(id);
			model.addAttribute("notice", n);
			return "/notice/notice-view";
		}
		
		
		@RequestMapping("/listforuser")
		public String listforuser(Model model) {
			INoticeService noticeservice=new NoticeServiceImpl();
			List<Notice> list=noticeservice.FindAll();
			model.addAttribute("notice", list);
			return "/notice/user-notice-list";
		}
	}




