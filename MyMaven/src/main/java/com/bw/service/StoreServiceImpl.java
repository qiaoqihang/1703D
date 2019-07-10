package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.Band;
import com.bw.bean.Store;
import com.bw.mapper.StoreMapper;

@Service
@Transactional
public class StoreServiceImpl implements StoreService{
	@Autowired
	private StoreMapper sm;

	@Override
	public List findList(String sname) {
		// TODO Auto-generated method stub
		return sm.selectList(sname);
	}

	@Override
	public int addStore(Store s) {
		// TODO Auto-generated method stub
		return sm.insertStore(s);
	}

	@Override
	public List<Band> findAddShow() {
		// TODO Auto-generated method stub
		return sm.selectAddShow();
	}

	@Override
	public int insertshow(int bid, int sid) {
		// TODO Auto-generated method stub
		return sm.insertshow(bid, sid);
	}

	@Override
	public int delsStore(String bids) {
		// TODO Auto-generated method stub
		return sm.delsStore(bids);
	}

	@Override
	public Store findOneStore(int sid) {
		// TODO Auto-generated method stub
		return sm.selectOneStore(sid);
	}
	
}
