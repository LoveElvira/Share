package com.best.share.bean;
/**
 * 存放评论数据后的回复的数据的实体类
 * */
public class Answer {
	private String answerID;//回复人的ID
	private String answerText;//回复的内容
	private String discussID;//评论人的ID
	public Answer() {
	}
	public Answer(String answerID, String answerText, String discussID) {
		this.answerID = answerID;
		this.answerText = answerText;
		this.discussID = discussID;
	}
	public String getAnswerID() {
		return answerID;
	}
	public void setAnswerID(String answerID) {
		this.answerID = answerID;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public String getDiscussID() {
		return discussID;
	}
	public void setDiscussID(String discussID) {
		this.discussID = discussID;
	}
}
