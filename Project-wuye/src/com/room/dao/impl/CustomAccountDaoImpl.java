package com.room.dao.impl;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.room.dao.ICustomAccountDao;
import com.room.bean.CustomAccount;
import com.room.util.MybatisUtils;
/**
 * 
 * @ClassName: CustomAccountDaoImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:21:36
 * @param:
 */
public class CustomAccountDaoImpl implements ICustomAccountDao{
	private static SqlSession session;
	private static String statement;
	
		public List<CustomAccount> getALLcustomAccount() {		
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".selectAllCustomAccounts";
			List<CustomAccount> list = session.selectList(statement);
			return list;
		}
		
		public void save(CustomAccount c) {	
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".insertCustomAccount";
			session.insert(statement,c);
			session.close();
		}
		
		public CustomAccount getCustomAccountById(String accountid){	
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".getCustomAccount";
			CustomAccount c=session.selectOne(statement,accountid);
			return c;
		}
		
		public void update(CustomAccount c) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".updateCustomAccount";
			session.update(statement, c);
			session.close();
		}
		
		public void delete(String accountid) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".deleteCustomAccount";
			session.delete(statement, accountid);
			session.close();
		}
		
		public CustomAccount getCustomAccountBynp(String username,String password){
			CustomAccount customAccount=new CustomAccount();
			customAccount.setUsername(username);
			customAccount.setPassword(password);
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".selectCustomAccount";
			CustomAccount c = session.selectOne(statement,customAccount);
			return c;
		}
	}



