package com.room.bean;

/**
 * @ClassName: Inspection
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:22:06
 * @param:
 */
public class Inspection {
	private int id;
	private String person;
	private String type;
	private String itime ;
	private String conductor;
	private String party;
	private String result;
	private String memo;
	
	
	
	public Inspection() {
		super();
	}
	public Inspection(int id, String person, String type, String itime, String conductor, String party, String result,
			String memo) {
		super();
		this.id = id;
		this.person = person;
		this.type = type;
		this.itime = itime;
		this.conductor = conductor;
		this.party = party;
		this.result = result;
		this.memo = memo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getItime() {
		return itime;
	}
	public void setItime(String itime) {
		this.itime = itime;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}

