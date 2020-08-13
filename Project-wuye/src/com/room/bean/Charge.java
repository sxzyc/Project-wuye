package com.room.bean;

/**
 * @ClassName: Charge
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:20:34
 * @param:
 */
public class Charge {
	private int id;
	private Double metre;
	private String name;
	private String phone;
	private String username;
	private String status;
	private String sdate;
	private String rdate;
	private Double tcost;
	private Double scost;
	private String smemo;
	
	
	public Charge() {
		super();
	}


	public Charge(int id, Double metre, String name, String phone, String username, String status, String sdate,
			String rdate, Double tcost, Double scost, String smemo) {
		super();
		this.id = id;
		this.metre = metre;
		this.name = name;
		this.phone = phone;
		this.username = username;
		this.status = status;
		this.sdate = sdate;
		this.rdate = rdate;
		this.tcost = tcost;
		this.scost = scost;
		this.smemo = smemo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Double getMetre() {
		return metre;
	}


	public void setMetre(Double metre) {
		this.metre = metre;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getSdate() {
		return sdate;
	}


	public void setSdate(String sdate) {
		this.sdate = sdate;
	}


	public String getRdate() {
		return rdate;
	}


	public void setRdate(String rdate) {
		this.rdate = rdate;
	}


	public Double getTcost() {
		return tcost;
	}


	public void setTcost(Double tcost) {
		this.tcost = tcost;
	}


	public Double getScost() {
		return scost;
	}


	public void setScost(Double scost) {
		this.scost = scost;
	}


	public String getSmemo() {
		return smemo;
	}


	public void setSmemo(String smemo) {
		this.smemo = smemo;
	}
	

}

