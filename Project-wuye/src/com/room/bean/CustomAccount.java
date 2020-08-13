package com.room.bean;

/**
 * @ClassName: CustomAccount
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:21:10
 * @param:
 */
public class CustomAccount {
	private int accountid;
	private String username;
	private String password;
	private String ownerid;
	private String carid;
	
	
	public CustomAccount() {
		super();
	}


	public CustomAccount(int accountid, String username, String password, String ownerid, String carid) {
		super();
		this.accountid = accountid;
		this.username = username;
		this.password = password;
		this.ownerid = ownerid;
		this.carid = carid;
	}


	public int getAccountid() {
		return accountid;
	}


	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getOwnerid() {
		return ownerid;
	}


	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}


	public String getCarid() {
		return carid;
	}


	public void setCarid(String carid) {
		this.carid = carid;
	}
	
	
	
}

