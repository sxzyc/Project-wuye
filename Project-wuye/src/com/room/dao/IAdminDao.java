package com.room.dao;

import java.util.List;

import com.room.bean.Admin;
/**
 * 
 * @ClassName: IAdminDao
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:13:58
 * @param:
 */
public interface IAdminDao {
	List<Admin> getAllAdmin();
	void save(Admin a); 
	
	Admin getAdminById(String id);
	Admin getAdminBynp(String name,String password);
	void update(Admin a);
	
	void delete(String id);
	
}	
