package cn.bluesking.blog.model.entity;


public class Role {

	/**
	 * 角色编号
	 */
	private Integer roleNo = null;

	/**
	 * 角色名
	 */
	private String roleName = null;

	public void setRoleNo(Integer roleNo) {
		this.roleNo = roleNo;
	}

	public Integer getRoleNo() {
		return this.roleNo;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return this.roleName;
	}

}