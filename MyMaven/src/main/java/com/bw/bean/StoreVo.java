package com.bw.bean;

public class StoreVo {
	private String bids;
	
	private Integer [] bnd;
	
	

	public Integer[] getBnd() {
		return bnd;
	}

	public void setBnd(Integer[] bnd) {
		this.bnd = bnd;
	}

	public String getBids() {
		return bids;
	}

	public void setBids(String bids) {
		this.bids = bids;
	}

	public StoreVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreVo(String bids) {
		super();
		this.bids = bids;
	}

	@Override
	public String toString() {
		return "StoreVo [bids=" + bids + "]";
	}
	
	
}
