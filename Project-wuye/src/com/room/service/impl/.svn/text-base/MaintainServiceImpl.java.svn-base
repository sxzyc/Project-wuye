package com.cissst.service.impl;

import java.util.List;

import com.cissst.dao.IMaintainDao;
import com.cissst.dao.impl.MaintainDaoImpl;
import com.cissst.entity.Maintain;
import com.cissst.service.IMaintainService;


public class MaintainServiceImpl  implements IMaintainService{
	
	IMaintainDao ad = new MaintainDaoImpl();
	public List<Maintain> findAllMaintains() {
		List<Maintain> list = ad.getAllMaintain();
		return list;
	}
	
	public void save(Maintain a) {
		ad.save(a);
	}
	
	public Maintain findById(String id) {
		Maintain Maintain = ad.getMaintainById(id);
		return Maintain;
	}

	public List<Maintain> findByMaintainer(String maintainer) {
		List<Maintain> Maintain = ad.getMaintainByMaintainer(maintainer);
		return Maintain;
	}
	public void update(Maintain a) {
		ad.update(a);
	}
	
	public void delete(String id) {
		ad.delete(id);
	}

}
