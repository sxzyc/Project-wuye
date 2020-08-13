package com.cissst.service.impl;

import java.util.List;

import com.cissst.dao.ICustomAccountDao;
import com.cissst.dao.impl.CustomAccountDaoImpl;
import com.cissst.entity.CustomAccount;
import com.cissst.service.ICustomAccountService;

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


