package com.wordmaster.po;

public class WordType {

	private long id;
	private String code;
	private String description;

	public WordType(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}
	
	public WordType(){}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
