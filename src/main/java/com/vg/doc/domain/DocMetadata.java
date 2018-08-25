package com.vg.doc.domain;

public class DocMetadata extends ObjectMetadata {

	private String title;
	private String type;

	public DocMetadata(String createBy, String createDate, String modifyDate,
			String title, String type) {
		super(createBy, createDate, modifyDate);
		this.title = title;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return super.toString() + " DocMetadata [title=" + title + ", type=" + type + "]";
	}

}
