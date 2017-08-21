package cn.bluesking.blog.model.entity;

import java.sql.Timestamp;

public class Subject {

	/**
	 * 页面主体编号
	 */
	private Integer subjectNo = null;

	/**
	 * 页面标题
	 */
	private String title = null;

	/**
	 * 页面摘要
	 */
	private String summary = null;

	/**
	 * 页面主体内容
	 */
	private String content = null;

	/**
	 * 当前主体发布时间
	 */
	private Timestamp releaseTime = null;

	/**
	 * 当前记录最后修改时间
	 */
	private Timestamp lastModifiedTime = null;

	/**
	 * 页面主体类别
	 */
	private Integer categoryNo = null;

	/**
	 * 当前页面访问量
	 */
	private Integer pageView = null;

	/**
	 * 作者用户编号
	 */
	private Integer userNo = null;

	public void setSubjectNo(Integer subjectNo) {
		this.subjectNo = subjectNo;
	}

	public Integer getSubjectNo() {
		return this.subjectNo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setReleaseTime(Timestamp releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Timestamp getReleaseTime() {
		return this.releaseTime;
	}

	public void setLastModifiedTime(Timestamp lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Timestamp getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setCategoryNo(Integer categoryNo) {
		this.categoryNo = categoryNo;
	}

	public Integer getCategoryNo() {
		return this.categoryNo;
	}

	public void setPageView(Integer pageView) {
		this.pageView = pageView;
	}

	public Integer getPageView() {
		return this.pageView;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	public Integer getUserNo() {
		return this.userNo;
	}

}