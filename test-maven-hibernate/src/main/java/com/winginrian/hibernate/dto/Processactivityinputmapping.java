package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Processactivityinputmapping generated by hbm2java
 */
public class Processactivityinputmapping implements java.io.Serializable {

	private Integer id;
	private Integer processId;
	private Integer flowId;
	private String inputXml;
	private String xslt;

	public Processactivityinputmapping() {
	}

	public Processactivityinputmapping(Integer processId, Integer flowId, String inputXml, String xslt) {
		this.processId = processId;
		this.flowId = flowId;
		this.inputXml = inputXml;
		this.xslt = xslt;
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

	public Integer getFlowId() {
		return this.flowId;
	}

	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}

	public String getInputXml() {
		return this.inputXml;
	}

	public void setInputXml(String inputXml) {
		this.inputXml = inputXml;
	}

	public String getXslt() {
		return this.xslt;
	}

	public void setXslt(String xslt) {
		this.xslt = xslt;
	}

}
