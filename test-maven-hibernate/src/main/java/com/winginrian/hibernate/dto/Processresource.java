package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Processresource generated by hbm2java
 */
public class Processresource implements java.io.Serializable {

	private Integer id;
	private Integer processId;
	private Integer resourceId;
	private Short resourceNumber;

	public Processresource() {
	}

	public Processresource(Integer processId, Integer resourceId, Short resourceNumber) {
		this.processId = processId;
		this.resourceId = resourceId;
		this.resourceNumber = resourceNumber;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProcessId() {
		return this.processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public Short getResourceNumber() {
		return this.resourceNumber;
	}

	public void setResourceNumber(Short resourceNumber) {
		this.resourceNumber = resourceNumber;
	}

}
