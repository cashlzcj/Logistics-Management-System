package com.global.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Position generated by MyEclipse Persistence Tools
 */

public class Position implements java.io.Serializable {

	// Fields

	private Integer positionid;

	private String name;

	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Position() {
	}

	/** full constructor */
	public Position(String name, Set employees) {
		this.name = name;
		this.employees = employees;
	}

	// Property accessors

	public Integer getPositionid() {
		return this.positionid;
	}

	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}