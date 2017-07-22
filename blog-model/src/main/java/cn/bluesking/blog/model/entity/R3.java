package cn.bluesking.blog.model.entity;

import java.math.BigInteger;

public class R3 {

	private BigInteger id = null;

	private String name = null;

	private Integer accesses = null;

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAccesses(Integer accesses) {
		this.accesses = accesses;
	}

	public Integer getAccesses() {
		return this.accesses;
	}

}