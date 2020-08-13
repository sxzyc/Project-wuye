package com.room.service.impl;

import java.util.List;

import com.room.bean.CustomAccount;
import com.room.dao.ICustomAccountDao;
import com.room.dao.impl.CustomAccountDaoImpl;
import com.room.service.ICustomAccountService;
/**
 * 
 * @ClassName: CustomAccountServiceImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:26:34
 * @param:
 */
public class CustomAccountServiceImpl implements ICustomAccountService{
	ICustomAccountDao cd = new CustomAccountDaoImpl();
	
	public void save(CustomAccount c) {
		cd.save(c);
	}
	
	public CustomAccount findById(String accountid) {
		CustomAccount customaccount = cd.getCustomAccountById(accountid);
		return customaccount;
	}

	public CustomAccount findBynp(String username, String password) {
		CustomAccount customaccount = cd.getCustomAccountBynp(username,password);
		return customaccount;
	}
	public void update(CustomAccount c) {
		cd.update(c);
	}
	
	public void delete(String accountid) {
		cd.delete(accountid);
	}
	public List<CustomAccount> findAllcustomAccount() {
		List<CustomAccount> list = cd.getALLcustomAccount();
		return list;

	}
}


