package com.room.service;

import java.util.List;

import com.room.bean.Notice;

/**
 * 
 * @ClassName: INoticeService
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:25:25
 * @param:
 */
public interface INoticeService {
	List<Notice> FindAll();
	Notice Select(String id);
	void Add(Notice n);
	void Delete(String id);
	void Update(Notice n);

}
