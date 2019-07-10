package com.bw.bean;

public class Store {
	private int sid;
	private String sname;
	private String time;
	private String bnames;
	
	public String getBnames() {
		return bnames;
	}
	public void setBnames(String bnames) {
		this.bnames = bnames;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store(int sid, String sname, String time) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Store [sid=" + sid + ", sname=" + sname + ", time=" + time + "]";
	}
	
}
