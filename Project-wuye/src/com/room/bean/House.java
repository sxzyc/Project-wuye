package com.room.bean;

/**
 * @ClassName: House
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:21:42
 * @param:
 */
public class House {
	private int id;
	private String num;
	private String dep;
	private String type;
	private String area;
	private String sell;
	private String unit;
	private String floor;
	private String direction;
	private String memo;
	private String ownerid;
	
	
	public House() {
		super();
	}
	public House(int id, String num, String dep, String type, String area, String sell, String unit, String floor,
			String direction, String memo, String ownerid) {
		super();
		this.id = id;
		this.num = num;
		this.dep = dep;
		this.type = type;
		this.area = area;
		this.sell = sell;
		this.unit = unit;
		this.floor = floor;
		this.direction = direction;
		this.memo = memo;
		this.ownerid = ownerid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSell() {
		return sell;
	}
	public void setSell(String sell) {
		this.sell = sell;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}
	
}

