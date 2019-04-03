package com.taotao.service;

import com.taotao.pojo.EasyUiDataGridResult;

public interface ItemListService {
	/**
	 * 根据当前的页码和行数进行查询
	 * @param page
	 * @param rows
	 * @return
	 */
	public EasyUiDataGridResult getItemList(Integer page,Integer rows);
}
