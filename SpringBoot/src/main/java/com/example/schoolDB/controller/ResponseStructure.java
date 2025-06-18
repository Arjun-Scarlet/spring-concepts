package com.example.schoolDB.controller;

public class ResponseStructure<T> {
	private int statusCode;
	private String title;
	private T data;
	public ResponseStructure(int statusCode, String title, T data) {
		this.statusCode = statusCode;
		this.title = title;
		this.data = data;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
