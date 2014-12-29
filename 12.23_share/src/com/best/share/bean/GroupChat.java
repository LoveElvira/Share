package com.best.share.bean;

/**
 * 
 * 存放组内成员的聊天记录 
 * 
 * */

public class GroupChat {
	private int ID;
	private String chatID;//聊天人的ID
	private String pubDate;//发送聊天内容的时间
	private String chatLook;//表情
	private String chatText;//聊天的内容
	public GroupChat() {
	}
	
	public GroupChat(int iD, String chatID, String pubDate, String chatLook,
			String chatText) {
		ID = iD;
		this.chatID = chatID;
		this.pubDate = pubDate;
		this.chatLook = chatLook;
		this.chatText = chatText;
	}

	public GroupChat(String chatID, String pubDate, String chatLook,
			String chatText) {
		this.chatID = chatID;
		this.pubDate = pubDate;
		this.chatLook = chatLook;
		this.chatText = chatText;
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
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getChatLook() {
		return chatLook;
	}
	public void setChatLook(String chatLook) {
		this.chatLook = chatLook;
	}
	public String getChatText() {
		return chatText;
	}
	public void setChatText(String chatText) {
		this.chatText = chatText;
	}
	@Override
	public String toString() {
		return "GroupChat [ID=" + ID + ", chatID=" + chatID + ", pubDate="
				+ pubDate + ", chatLook=" + chatLook + ", chatText=" + chatText
				+ "]";
	}
	
}
