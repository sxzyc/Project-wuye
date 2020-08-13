package com.room.bean;

/**
 * @ClassName: Notice
 * @Description:
 * @author: 赵越超
 * @date: 2020年4月14日 下午8:23:05
 * @param:
 */
public class Notice {
	private int id;
	private String content;
	private String ndate;
	private String title;
	private String uper;
	
	
	
	public Notice() {
		super();
	}
	public Notice(int id, String content, String ndate, String title, String uper) {
		super();
		this.id = id;
		this.content = content;
		this.ndate = ndate;
		this.title = title;
		this.uper = uper;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUper() {
		return uper;
	}
	public void setUper(String uper) {
		this.uper = uper;
	}

}

