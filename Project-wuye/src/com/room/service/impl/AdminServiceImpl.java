package com.room.service.impl;

import java.util.List;

import com.room.bean.Admin;
import com.room.dao.IAdminDao;
import com.room.dao.impl.AdminDaoImpl;
import com.room.service.IAdminService;
/**
 * 
 * @ClassName: AdminServiceImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:25:58
 * @param:
 */
public class AdminServiceImpl  implements IAdminService{
	
	IAdminDao ad = new AdminDaoImpl();
	public List<Admin> findAlladmins() {
		List<Admin> list = ad.getAllAdmin();
		return list;
	}
	
	public void save(Admin a) {
		ad.save(a);
	}
	
	public Admin findById(String id) {
		Admin admin = ad.getAdminById(id);
		return admin;
	}

	public Admin findBynp(String name, String password) {
		Admin admin = ad.getAdminBynp(name,password);
		return admin;
	}
	public void update(Admin a) {
		ad.update(a);
	}
	
	public void delete(String id) {
		ad.delete(id);
	}

}
