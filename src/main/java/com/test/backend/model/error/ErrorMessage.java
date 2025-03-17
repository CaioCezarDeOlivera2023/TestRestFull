package com.test.backend.model.error;

public class ErrorMessage {

	private String title;
	private Integer status;
	private String menssage;

	public ErrorMessage() {
	}

	public ErrorMessage(String title, Integer status, String menssage) {
		super();
		this.title = title;
		this.status = status;
		this.menssage = menssage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMenssage() {
		return menssage;
	}

	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}

}
