package com.taotao.pojo;


import java.io.Serializable;
import java.util.List;

public class EasyUiDataGridResult implements Serializable {
	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	private Long total;
	
	private List rows;

	

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	
}
