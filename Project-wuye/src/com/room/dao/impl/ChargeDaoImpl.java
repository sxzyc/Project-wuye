
package com.room.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.room.dao.IChargeDao;
import com.room.bean.Charge;
import com.room.util.MybatisUtils;

/**
 * 
 * @ClassName: ChargeDaoImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:20:05
 * @param:
 */
	public class ChargeDaoImpl implements IChargeDao{
		private static SqlSession session;
		private static String statement;
		
		public List<Charge> getAllCharge() {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".selectAllCharges";
			List<Charge> list = session.selectList(statement);
			return list;
		}
		
		public void save(Charge a) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".insertCharge";
			session.insert(statement,a);
			session.close();
		}
		
		
		public Charge getChargeById(String id) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".getCharge";
			Charge a = session.selectOne(statement,id);
			return a;
		}

		public void update(Charge a) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".updateCharge";
			session.update(statement, a);
			session.close();
		}

		public void delete(String id) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".deleteCharge";
			session.delete(statement, id);
			session.close();
		}
		
		public List<Charge> getChargeByUser(String username) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".selectCharge";
			List<Charge> list = session.selectList(statement,username);
			return list;
		}



	}


