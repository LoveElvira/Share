package com.best.share.bean;
/**
 * 存放用户详细情况的实体类
 * */
public class UserDetails {
	private String icon;//头像
	private String nickName;//昵称
	private String onLineState;//在线状态
	private String sex;
	private String age;
	private String starSign;//星座
	private String profession;//职业
	private String homeTown;//家乡
	private String declaration;//交友宣言
	private String voiceIntr;//语音介绍
	private String emotionState;//情感状态
	private String hobby;//兴趣
	private String registerID;//外键：用户注册表中的ID
	public UserDetails() {
	}
	public UserDetails(String icon, String nickName, String onLineState,
			String sex, String age, String starSign, String profession,
			String homeTown, String declaration, String voiceIntr,
			String emotionState, String hobby, String registerID) {
		this.icon = icon;
		this.nickName = nickName;
		this.onLineState = onLineState;
		this.sex = sex;
		this.age = age;
		this.starSign = starSign;
		this.profession = profession;
		this.homeTown = homeTown;
		this.declaration = declaration;
		this.voiceIntr = voiceIntr;
		this.emotionState = emotionState;
		this.hobby = hobby;
		this.registerID = registerID;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getOnLineState() {
		return onLineState;
	}
	public void setOnLineState(String onLineState) {
		this.onLineState = onLineState;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getStarSign() {
		return starSign;
	}
	public void setStarSign(String starSign) {
		this.starSign = starSign;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getDeclaration() {
		return declaration;
	}
	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}
	public String getVoiceIntr() {
		return voiceIntr;
	}
	public void setVoiceIntr(String voiceIntr) {
		this.voiceIntr = voiceIntr;
	}
	public String getEmotionState() {
		return emotionState;
	}
	public void setEmotionState(String emotionState) {
		this.emotionState = emotionState;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getRegisterID() {
		return registerID;
	}
	public void setRegisterID(String registerID) {
		this.registerID = registerID;
	}
	
}
