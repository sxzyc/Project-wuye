package com.room.service;

import java.util.List;

import com.room.bean.CustomAccount;


/**
 * 
 * @ClassName: ICustomAccountService
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:24:46
 * @param:
 */
public interface ICustomAccountService {
	List<CustomAccount> findAllcustomAccount();
	void save(CustomAccount c);
	void update(CustomAccount c);
	void delete(String accountid);
	CustomAccount findById(String accountid);
	CustomAccount findBynp(String username,String password);
}