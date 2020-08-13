package com.room.service.impl;

import java.util.List;

import com.room.bean.Charge;
import com.room.dao.IChargeDao;
import com.room.dao.impl.ChargeDaoImpl;
import com.room.service.IChargeService;


/**
 * 
 * @ClassName: ChargeServiceImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:26:19
 * @param:
 */
public class ChargeServiceImpl  implements IChargeService{
	
	IChargeDao ad = new ChargeDaoImpl();
	public List<Charge> findAllCharges() {
		List<Charge> list = ad.getAllCharge();
		return list;
	}
	
	public void save(Charge a) {
		ad.save(a);
	}
	
	public Charge findById(String id) {
		Charge charge = ad.getChargeById(id);
		return charge;
	}

	public List<Charge> findByCharge(String username) {
		List<Charge> charge = ad.getChargeByUser(username);
		return charge;
	}
	public void update(Charge a) {
		ad.update(a);
	}
	
	public void delete(String id) {
		ad.delete(id);
	}

}
