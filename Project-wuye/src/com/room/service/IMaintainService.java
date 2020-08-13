package com.room.service;

import java.util.List;

import com.room.bean.Maintain;

/**
 * 
 * @ClassName: IMaintainService
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:25:16
 * @param:
 */
public interface IMaintainService {
	List<Maintain> findAllMaintains();
	void save(Maintain a); 
	
	Maintain findById(String id);
	List<Maintain> findByMaintainer(String maintainer);
	
	void update(Maintain a);
	
	void delete(String id);

}
