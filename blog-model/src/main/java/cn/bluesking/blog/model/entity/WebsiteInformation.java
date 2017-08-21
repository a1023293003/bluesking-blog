package cn.bluesking.blog.model.entity;

import java.sql.Timestamp;

public class WebsiteInformation {

	/**
	 * 网站信息编号
	 */
	private Integer informationNo = null;

	/**
	 * 网站至今总访问量
	 */
	private Integer pageView = null;

	/**
	 * 当前记录最后修改时间
	 */
	private Timestamp lastModifiedTime = null;

	public void setInformationNo(Integer informationNo) {
		this.informationNo = informationNo;
	}

	public Integer getInformationNo() {
		return this.informationNo;
	}

	public void setPageView(Integer pageView) {
		this.pageView = pageView;
	}

	public Integer getPageView() {
		return this.pageView;
	}

	public void setLastModifiedTime(Timestamp lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Timestamp getLastModifiedTime() {
		return this.lastModifiedTime;
	}

}