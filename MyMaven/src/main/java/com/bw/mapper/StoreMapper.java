package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.bean.Band;
import com.bw.bean.Store;

public interface StoreMapper {
//	展示店铺以及所售商品表
	public List selectList(@Param("sname") String sname);
//	添加店铺
	public int insertStore(Store s);
//	商品复选框的回显
	public List<Band> selectAddShow();
//	为店铺添加商品
	public int insertshow(@Param("bid")int bid,@Param("sid")int sid);
//	批量删除
	public int delsStore(@Param("bids")String bids);
//	查看详情
	public Store selectOneStore(int sid);
}
