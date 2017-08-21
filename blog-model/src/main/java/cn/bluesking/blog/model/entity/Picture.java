package cn.bluesking.blog.model.entity;


public class Picture {

	/**
	 * 图片编号
	 */
	private Integer pictureNo = null;

	/**
	 * 图片链接
	 */
	private String url = null;

	/**
	 * 图片介绍
	 */
	private String introduction = null;

	/**
	 * 图片类别
	 */
	private Integer categoryNo = null;

	public void setPictureNo(Integer pictureNo) {
		this.pictureNo = pictureNo;
	}

	public Integer getPictureNo() {
		return this.pictureNo;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setCategoryNo(Integer categoryNo) {
		this.categoryNo = categoryNo;
	}

	public Integer getCategoryNo() {
		return this.categoryNo;
	}

}