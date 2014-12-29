package com.best.share.bean;
/**
 * 存放分享后的评论的数据的实体类
 * */
public class Discuss {
	private String discussID;//评论人的ID
	private String pubDate;//评论的时间
	private String discussText;//评论的内容
	private String shareID;//外键：分享表（Share）的ID
	public Discuss() {
	}
	public Discuss(String discussID, String pubDate, String discussText,
			String shareID) {
		this.discussID = discussID;
		this.pubDate = pubDate;
		this.discussText = discussText;
		this.shareID = shareID;
	}
	public String getDiscussID() {
		return discussID;
	}
	public void setDiscussID(String discussID) {
		this.discussID = discussID;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getDiscussText() {
		return discussText;
	}
	public void setDiscussText(String discussText) {
		this.discussText = discussText;
	}
	public String getShareID() {
		return shareID;
	}
	public void setShareID(String shareID) {
		this.shareID = shareID;
	}
}
