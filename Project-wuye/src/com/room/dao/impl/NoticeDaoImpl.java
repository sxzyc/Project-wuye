package com.room.dao.impl;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.room.dao.INoticeDao;
import com.room.bean.Notice;
import com.room.util.MybatisUtils;
/**
 * 
 * @ClassName: NoticeDaoImpl
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:22:44
 * @param:
 */
public class NoticeDaoImpl implements INoticeDao{
	private static SqlSession session;
	private static String statement;

	public List<Notice> FindAll() {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".selectAllNotice";
		List<Notice> list=session.selectList(statement);
		return list;
	}

	public Notice Select(String id) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".getNotice";
		Notice n=session.selectOne(statement,id);
		return n;
	}
	
	
	public void Add(Notice n) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".insertNotice";
		session.insert(statement,n);
		session.close();
	}

	public void Update(Notice n) {
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".updateNotice";
		session.update(statement, n);
		session.close();
		
	}

	public void Delete(String id) { 
		session=MybatisUtils.getFactory();
		statement = "rjxy.userMapper1"+".deleteNotice";
		session.delete(statement, id);
		session.close();
	}

}
