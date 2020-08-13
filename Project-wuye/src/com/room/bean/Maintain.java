package com.room.bean;

/**
 * @ClassName: Maintain
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:22:35
 * @param:
 */
public class Maintain {
	private int id;
	private String thing;
	private String status;
	private String homesnumber;
	private String sdate;
	private String rdate;
	private Double tcost;
	private Double scost;
	private String maintainer;
	private String smemo;
	
	
	public Maintain() {
		super();
	}


	public Maintain(int id, String thing, String status, String homesnumber, String sdate, String rdate, Double tcost,
			Double scost, String maintainer, String smemo) {
		super();
		this.id = id;
		this.thing = thing;
		this.status = status;
		this.homesnumber = homesnumber;
		this.sdate = sdate;
		this.rdate = rdate;
		this.tcost = tcost;
		this.scost = scost;
		this.maintainer = maintainer;
		this.smemo = smemo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getThing() {
		return thing;
	}


	public void setThing(String thing) {
		this.thing = thing;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getHomesnumber() {
		return homesnumber;
	}


	public void setHomesnumber(String homesnumber) {
		this.homesnumber = homesnumber;
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


	public String getMaintainer() {
		return maintainer;
	}


	public void setMaintainer(String maintainer) {
		this.maintainer = maintainer;
	}


	public String getSmemo() {
		return smemo;
	}


	public void setSmemo(String smemo) {
		this.smemo = smemo;
	}
	


}

