package com.bw.service;

import java.util.List;

import com.bw.bean.Band;
import com.bw.bean.Store;

public interface StoreService {
//	展示店铺以及所售商品表
	public List findList( String sname);
	//添加店铺
	public int addStore(Store s);
	//商品复选框的回显
	public List<Band> findAddShow();
//	为店铺添加商品
	public int insertshow(int bid,int sid);
//	批量删除
	public int delsStore(String bids);
//	查看详情
	public Store findOneStore(int sid);
}
