package com.cissst.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cissst.dao.INoticeDao;
import com.cissst.dao.impl.NoticeDaoImpl;
import com.cissst.entity.Notice;
import com.cissst.service.INoticeService;

public  class NoticeServiceImpl implements INoticeService{
	INoticeDao notifydao=new NoticeDaoImpl();

	public List<Notice> FindAll() {
		List<Notice> list = new ArrayList<Notice>();
		list = notifydao.FindAll();
		return list;
	}

	public Notice Select(String id) {
		Notice n=new Notice();
		n=notifydao.Select(id);
		return n;
	}

	public void Add(Notice n) {
		notifydao.Add(n);
		
	}

	public void Delete(String id) {
		notifydao.Delete(id);
		
	}

	public void Update(Notice n) {
		notifydao.Update(n);
		
	}

}
