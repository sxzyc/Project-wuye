package com.room.dao;

import java.util.List;

import com.room.bean.Maintain;
/**
 * 
 * @ClassName: IMaintainDao
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:16:13
 * @param:
 */
public interface IMaintainDao {
	List<Maintain> getAllMaintain();
	void save(Maintain a); 
	Maintain getMaintainById(String id);
	List<Maintain> getMaintainByMaintainer(String maintainer);
	void update(Maintain a);
	void delete(String id);
}
