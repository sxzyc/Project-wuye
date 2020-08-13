package com.room.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * @ClassName: MybatisUtils
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:42:38
 * @param:
 */
public class MybatisUtils {
	public static SqlSession getFactory(){
		String resource = "conf.xml"; 
		
		InputStream reader=MybatisUtils.class.getClassLoader().getResourceAsStream(resource);
		 
		
SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		
SqlSession session = factory.openSession(true);
		return session;
	}
}
