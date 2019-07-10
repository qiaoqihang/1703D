package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Band;
import com.bw.bean.Store;
import com.bw.service.StoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Controller
public class StoreController {
	@Autowired
	private StoreService ss;
	
	@RequestMapping("list.do")
	public String sayListt(@RequestParam(name="sname",defaultValue="")String sname,
			@RequestParam(name="pageNum",defaultValue="0")int pageNum,Model m){
		int pageSize=3;
		System.err.println(sname);
		PageHelper.startPage(pageNum, pageSize);
		List list = ss.findList(sname);
		System.out.println(list);
		PageInfo pageInfo = new PageInfo<>(list);
		m.addAttribute("list", list);
		System.out.println(list);
		m.addAttribute("pageInfo", pageInfo);
		return "list";
	}
	@RequestMapping("addstore.do")
	public String testaddStore(Store s){
		int i = ss.addStore(s);
		if(i>0){
			return "redirect:list.do";
		}else{
			return "redirect:list.do";
		}
	}
	@RequestMapping("delstores.do")
	@ResponseBody
	public Object testdels(@RequestParam(name="bids",defaultValue="")String bids){
		int i = ss.delsStore(bids);
		if(i>0){
			return true;
		}else{
			return false;
		}
	}
	@RequestMapping("see.do")
	public String testsee(@RequestParam(name="sid",defaultValue="0")int sid,Model m){
		Store store = ss.findOneStore(sid);
		m.addAttribute("store", store);
		return "see";
	}
	@RequestMapping("findband.do")
	@ResponseBody
	public List<Band> testfindband(){
		List<Band> list = ss.findAddShow();
		System.out.println(list);
		return list;
	}
	@RequestMapping("addshow.do")
	@ResponseBody
	public Object testaddshow(@RequestParam(name="sid",defaultValue="")int sid,@RequestParam(name="bnd")int[] bnd){
		System.out.println(sid);
		
		  for (int i : bnd) {
			  System.out.println(i);
			  int bid = i;
		      ss.insertshow(bid, sid);
		    }
		
		return true;
	}
}
