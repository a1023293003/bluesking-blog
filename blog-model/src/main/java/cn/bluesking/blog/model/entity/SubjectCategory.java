package cn.bluesking.blog.model.entity;


public class SubjectCategory {

	/**
	 * 主体类别编号
	 */
	private Integer categoryNo = null;

	/**
	 * 主体类别名称
	 */
	private String categoryName = null;

	/**
	 * 该类主体数量
	 */
	private Integer categoryNum = null;

	/**
	 * 上级页面主体类别编号
	 */
	private Integer previousCategoryNo = null;

	public void setCategoryNo(Integer categoryNo) {
		this.categoryNo = categoryNo;
	}

	public Integer getCategoryNo() {
		return this.categoryNo;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryNum(Integer categoryNum) {
		this.categoryNum = categoryNum;
	}

	public Integer getCategoryNum() {
		return this.categoryNum;
	}

	public void setPreviousCategoryNo(Integer previousCategoryNo) {
		this.previousCategoryNo = previousCategoryNo;
	}

	public Integer getPreviousCategoryNo() {
		return this.previousCategoryNo;
	}

}