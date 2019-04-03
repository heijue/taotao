package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.EasyUiDataGridResult;
import com.taotao.service.ItemListService;

@Controller
public class ItemController {
	@Autowired
	private ItemListService servicer;
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUiDataGridResult getItemList(Integer page, Integer rows){
		return servicer.getItemList(page, rows);
	}

}
