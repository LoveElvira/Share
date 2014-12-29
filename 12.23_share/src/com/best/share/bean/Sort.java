package com.best.share.bean;
/**
 * 存放分享类型的实体类
 * */
public class Sort {
	private String type;//分享的类型：
	public Sort() {
	}
	public Sort(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
