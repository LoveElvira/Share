package com.best.share.bean;

/**
 * 
 * 存放组内成员的聊天记录 
 * 
 * */

public class GroupChat {
	private int ID;
	private String chatID;//聊天人的ID
	private String pubdate;//发送聊天内容的时间
	private String chatlook;//表情
	private String chattext;//聊天的内容
	public GroupChat() {
	}
	
	public GroupChat(int iD, String chatID, String pubdate, String chatlook,
			String chattext) {
		ID = iD;
		this.chatID = chatID;
		this.pubdate = pubdate;
		this.chatlook = chatlook;
		this.chattext = chattext;
	}

	public GroupChat(String chatID, String pubdate, String chatlook,
			String chattext) {
		this.chatID = chatID;
		this.pubdate = pubdate;
		this.chatlook = chatlook;
		this.chattext = chattext;
	}
	public int getID() {
		return ID;
	}
	public String getChatID() {
		return chatID;
	}
	public void setChatID(String chatID) {
		this.chatID = chatID;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getChatlook() {
		return chatlook;
	}
	public void setChatlook(String chatlook) {
		this.chatlook = chatlook;
	}
	public String getChattext() {
		return chattext;
	}
	public void setChattext(String chattext) {
		this.chattext = chattext;
	}
	@Override
	public String toString() {
		return "GroupChat [ID=" + ID + ", chatID=" + chatID + ", pubdate="
				+ pubdate + ", chatlook=" + chatlook + ", chattext=" + chattext
				+ "]";
	}
	
}
