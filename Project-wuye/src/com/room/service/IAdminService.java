package com.room.service;

import java.util.List;

import com.room.bean.Admin;


/**
 * 
 * @ClassName: IAdminService
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:23:28
 * @param:
 */
public interface IAdminService {
	List<Admin> findAlladmins();
	void save(Admin a );
	
	Admin findById(String id);
	Admin findBynp(String name,String password);
	
	void update(Admin a );
	void delete(String id);
}
