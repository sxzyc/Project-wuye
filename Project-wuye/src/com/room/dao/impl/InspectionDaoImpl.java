package com.room.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.room.dao.IInspectionDao;
import com.room.bean.Inspection;
import com.room.util.MybatisUtils;
/**
 * 
 * @ClassName: InspectionDaoImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:22:10
 * @param:
 */
public class InspectionDaoImpl implements IInspectionDao{
	private static SqlSession session;
	private static String statement;

	public List<Inspection> getAllInspection() {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".selectAllInspection";
		List<Inspection> list =session.selectList(statement);
		return list;
	}

	public void save(Inspection i) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".insertInspection";
		session.insert(statement,i);
		session.close();
	}

	
	public Inspection getInspectionById(String id) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".getInspection";
		Inspection i = session.selectOne(statement,id);
		return i;
	}

	public void update(Inspection i) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".updateInspection";
		session.update(statement, i);
		session.close();
	}

	public void delete(String id) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".deleteInspection";
		session.delete(statement, id);
		session.close();
	
		
	}
	
}
