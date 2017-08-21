package cn.bluesking.blog.model.entity;


public class User {

	/**
	 * 用户编号
	 */
	private Integer userNo = null;

	/**
	 * 用户名
	 */
	private String userName = null;

	/**
	 * 用户邮箱
	 */
	private String email = null;

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	public Integer getUserNo() {
		return this.userNo;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

}