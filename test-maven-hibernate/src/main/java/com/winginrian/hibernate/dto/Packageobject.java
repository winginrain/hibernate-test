package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Packageobject generated by hbm2java
 */
public class Packageobject implements java.io.Serializable {

	private Integer id;
	private Integer packageId;
	private Integer objectId;
	private Short objectType;
	private String objectName;

	public Packageobject() {
	}

	public Packageobject(Integer packageId, Integer objectId, Short objectType, String objectName) {
		this.packageId = packageId;
		this.objectId = objectId;
		this.objectType = objectType;
		this.objectName = objectName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public Short getObjectType() {
		return this.objectType;
	}

	public void setObjectType(Short objectType) {
		this.objectType = objectType;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

}
