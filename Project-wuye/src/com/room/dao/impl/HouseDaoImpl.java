package com.room.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.room.dao.IHouseDao;
import com.room.bean.House;
import com.room.util.MybatisUtils;
/**
 * 
 * @ClassName: HouseDaoImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:21:53
 * @param:
 */
public class HouseDaoImpl implements IHouseDao{
	private static SqlSession session;
	private static String statement;

	public List<House> getAllHouse() {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".selectAllHouses";
		List<House> list = session.selectList(statement);	
		return list;
	}

	
	public List<House> getHouseByOwnerid(String oid) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".selectHouse";
		List<House> list = session.selectList(statement,oid);
		return list;
	}
	
	public void add(House h) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".insertHouse";
		session.insert(statement,h);
		session.close();
	}

	public void update(House h) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".updateHouse";
		session.update(statement, h);
		session.close();
	}

	public void delete(String id) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".deleteHouse";
		session.delete(statement, id);
		session.close();
	}

	

	public House findById(String id) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".getHouse";
		House h = session.selectOne(statement,id);
		return h;
	}
	
}
