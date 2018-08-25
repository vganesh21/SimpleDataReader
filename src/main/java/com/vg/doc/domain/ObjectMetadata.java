package com.vg.doc.domain;

public class ObjectMetadata {

	private String createBy;
	private String createDate;
	private String modifyDate;

	public ObjectMetadata(String createBy, String createDate, String modifyDate) {
		this.createBy = createBy;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getModifyDate() {
		return modifyDate;
	}


	@Override
	public String toString() {
		return "ObjectMetadata [createBy=" + createBy + ", createDate=" + createDate + ", modifyDate=" + modifyDate
				+ "]";
	}

}