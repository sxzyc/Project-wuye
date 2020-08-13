package com.room.dao;

import java.util.List;
import com.room.bean.CustomAccount;
/**
 * 
 * @ClassName: ICustomAccountDao
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午9:15:18
 * @param:
 */
public interface ICustomAccountDao {
	List<CustomAccount> getALLcustomAccount(); 
    void save(CustomAccount c);
    void delete(String accountid);
    void update(CustomAccount c);
	CustomAccount getCustomAccountById(String accountid);
	CustomAccount getCustomAccountBynp(String username, String password);
}
