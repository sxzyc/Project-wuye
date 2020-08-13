package com.room.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


import com.room.dao.IAdminDao;
import com.room.bean.Admin;
import com.room.util.MybatisUtils;

/**
 * 
 * @ClassName: AdminDaoImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:19:45
 * @param:
 */
public class AdminDaoImpl implements IAdminDao{
	private static SqlSession session;
	private static String statement;
	
	public List<Admin> getAllAdmin() {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".selectAllAdmins";
		List<Admin> list = session.selectList(statement);
		return list;
	}
	
	public void save(Admin a) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".insertAdmin";
		session.insert(statement,a);
		session.close();
	}
	
	public Admin getAdminById(String id) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".getAdmin";
		Admin a=session.selectOne(statement,id);
		return a;
	}
	
	public void update(Admin a) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".updateAdmin";
		session.update(statement, a);
		session.close();
		
	}
	
	public void delete(String id) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".deleteAdmin";
		session.delete(statement, id);
		session.close();
	}

	public Admin getAdminBynp(String name, String password) {
		Admin admin=new Admin();
		admin.setName(name);
		admin.setPassword(password);
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".selectAdmin";
		Admin a=session.selectOne(statement,admin);
		return a;
	}
}
