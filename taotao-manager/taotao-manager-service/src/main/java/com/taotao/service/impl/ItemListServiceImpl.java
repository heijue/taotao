package com.taotao.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.EasyUiDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemListService;

@Service
public class ItemListServiceImpl implements ItemListService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public EasyUiDataGridResult getItemList(Integer page, Integer rows) {
		if (null == page) {
			page= 1;
		}
		if (null == rows) {
			rows = 30;
		}
		PageHelper.startPage(page, rows);
		TbItemExample example = new TbItemExample();
		List<TbItem> tbItems = tbItemMapper.selectByExample(example );
		
		PageInfo<TbItem> info = new PageInfo<>(tbItems);
		EasyUiDataGridResult result = new EasyUiDataGridResult();
		
		result.setTotal(info.getTotal());
		result.setRows(info.getList());
		return result;
	}


}
