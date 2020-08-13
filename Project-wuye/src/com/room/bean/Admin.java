package com.room.bean;

/**
 * @ClassName: Admin
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:19:27
 * @param:
 */
public class Admin {
	private int id;
	private String name;
	private String password;
	private String sex;
	private int age;
	private String tel;
	private String phone;
	private String addr;
	private String memo;
	
	
	public Admin() {
		super();
	}


	


	public Admin(int id, String name, String password, String sex, int age, String tel, String phone, String addr,
			String memo) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.phone = phone;
		this.addr = addr;
		this.memo = memo;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}



	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
}

