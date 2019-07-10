package com.bw.bean;

public class Band {
	private int bid;
	private String bname;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Band() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Band(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Band [bid=" + bid + ", bname=" + bname + "]";
	}
	
}
