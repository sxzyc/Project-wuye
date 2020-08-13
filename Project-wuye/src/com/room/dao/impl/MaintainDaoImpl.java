
package com.room.dao.impl;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.room.dao.IMaintainDao;
import com.room.bean.Maintain;
import com.room.util.MybatisUtils;

/**
 * 
 * @ClassName: MaintainDaoImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:22:27
 * @param:
 */
	public class MaintainDaoImpl implements IMaintainDao{
		
		private static SqlSession session;
		private static String statement;
		
		public List<Maintain> getAllMaintain() {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".selectAllMaintain";
			List<Maintain> list = session.selectList(statement);
			return list;
		}
		
		public void save(Maintain a) {
			
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".insertMaintain";
			session.insert(statement,a);
			session.close();
		}
		
		
		
		public Maintain getMaintainById(String id) {
			
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".getMaintain";
			Maintain a = session.selectOne(statement,id);
			return a;
		}
		
		
		
		
		public void update(Maintain a) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".updateMaintain";
			session.update(statement, a);
			session.close();
		}
		
		
		
		public void delete(String id) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".deleteMaintain";
			session.delete(statement, id);
			session.close();
		}


		public List<Maintain> getMaintainByMaintainer(String maintainer) {
			session=MybatisUtils.getFactory();
			statement = "rjxy.userMapper1"+".selectMaintain";
			List<Maintain> list =session.selectList(statement,maintainer);
			return list;
		}



	}


