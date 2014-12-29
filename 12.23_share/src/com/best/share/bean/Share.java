package com.best.share.bean;
/**
 * 存放分享数据的实体类
 * */
public class Share {
	private String sortID;//分类表（Sort）的ID
	private String feel;//心情
	private String picture;//图片
	private String video;//视频
	private String voice;//声音
	private String pubDate;//更新时间
	private String location;//位置
	private String discussNum;//评论量
	private String praiseNum;//点赞数
	private String userDetailsID;//外键：用户详情表（UserDetails）的ID
	public Share() {
	}
	public Share(String sortID, String feel, String picture, String video,
			String voice, String pubDate, String location, String discussNum,
			String praiseNum, String userDetailsID) {
		this.sortID = sortID;
		this.feel = feel;
		this.picture = picture;
		this.video = video;
		this.voice = voice;
		this.pubDate = pubDate;
		this.location = location;
		this.discussNum = discussNum;
		this.praiseNum = praiseNum;
		this.userDetailsID = userDetailsID;
	}
	public String getSortID() {
		return sortID;
	}
	public void setSortID(String sortID) {
		this.sortID = sortID;
	}
	public String getFeel() {
		return feel;
	}
	public void setFeel(String feel) {
		this.feel = feel;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDiscussNum() {
		return discussNum;
	}
	public void setDiscussNum(String discussNum) {
		this.discussNum = discussNum;
	}
	public String getPraiseNum() {
		return praiseNum;
	}
	public void setPraiseNum(String praiseNum) {
		this.praiseNum = praiseNum;
	}
	public String getUserDetailsID() {
		return userDetailsID;
	}
	public void setUserDetailsID(String userDetailsID) {
		this.userDetailsID = userDetailsID;
	}
	
}
