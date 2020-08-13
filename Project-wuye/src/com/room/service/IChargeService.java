package com.room.service;

import java.util.List;

import com.room.bean.Charge;

/**
 * 
 * @ClassName: IChargeService
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:24:36
 * @param:
 */
public interface IChargeService {
	List<Charge> findAllCharges();
	void save(Charge a); 
	
	Charge findById(String id);
	List<Charge> findByCharge(String username);
	
	void update(Charge a);
	
	void delete(String id);

}
