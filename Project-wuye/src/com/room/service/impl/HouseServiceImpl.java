package com.room.service.impl;

import java.util.List;

import com.room.bean.House;
import com.room.dao.IHouseDao;
import com.room.dao.impl.HouseDaoImpl;
import com.room.service.IHouseService;
/**
 * 
 * @ClassName: HouseServiceImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:26:53
 * @param:
 */
public class HouseServiceImpl implements IHouseService{
	IHouseDao hdao=new HouseDaoImpl();
	public List<House> findAllHouse() {
		List<House> list =hdao.getAllHouse();
		return list;
	}

	public List<House> findByOwnerid(String oid) {
		List<House> list =hdao.getHouseByOwnerid(oid);
		return list;
	}

	public void add(House h) {
		hdao.add(h);
	}

	public void delete(String id) {
		hdao.delete(id);
	}

	public void update(House h) {
		hdao.update(h);
	}

	public House findById(String id) {
		return hdao.findById(id);
	}
	
}
