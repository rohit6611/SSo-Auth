package com.altruist.response;

public class StatusDescription {

	private Integer statusCode;
	private String description;
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "StatusDescription [statusCode=" + statusCode + ", description=" + description + "]";
	}
	
}
