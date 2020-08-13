package com.cissst.service.impl;

import java.util.List;

import com.cissst.dao.IHouseDao;
import com.cissst.dao.impl.HouseDaoImpl;
import com.cissst.entity.House;
import com.cissst.service.IHouseService;

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
