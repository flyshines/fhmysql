package com.fh.entity;

import java.io.Serializable;
/**
 * 分页类
 * @author admin
 *
 */

public class PageBean implements Serializable {

	private static final long serialVersionUID = -5928643519472654753L;
	private int currPage=1;  //当前页
	private int pageSize=5;  //每页显示几条记录
	private int pageCount;  //总共多少页
	private int totalCount;  //查询出的总的数据
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	//获取总共多少页
	public int getPageCount() {
		if(totalCount % pageSize==0){
			pageCount=totalCount/pageSize;
		}else{
			pageCount=totalCount/pageSize +1;
		}
		return pageCount;
	}

	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
}
