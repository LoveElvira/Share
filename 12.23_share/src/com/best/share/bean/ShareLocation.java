package com.best.share.bean;

/**
 * 
 * 存放在本地的经纬度
 * 在一定的时间内进行变化
 * 
 * */

public class ShareLocation {
	private int ID;
	private String longitude;//经度
	private String latitude;//纬度
	private String pubDate;//更新的时间
	private String userDetailID;//登陆用户的ID
	public ShareLocation() {
	}
	
	public ShareLocation(int iD, String longitude, String latitude,
			String pubDate, String userDetailID) {
		ID = iD;
		this.longitude = longitude;
		this.latitude = latitude;
		this.pubDate = pubDate;
		this.userDetailID = userDetailID;
	}

	public ShareLocation( String longitude, String latitude, String pubDate,String userDetailID) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.pubDate = pubDate;
		this.userDetailID = userDetailID;
	}
	public int getID() {
		return ID;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubdate) {
		this.pubDate = pubdate;
	}
	public String getUserDetailID() {
		return userDetailID;
	}
	public void setUserDetailID(String userDetailID) {
		this.userDetailID = userDetailID;
	}
	@Override
	public String toString() {
		return "Location [ID=" + ID + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", pubdate=" + pubDate + "]";
	}
	
}
