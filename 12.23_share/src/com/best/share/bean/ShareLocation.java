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
	private String pubdate;//更新的时间
	private String userdetailID;//登陆用户的ID
	public ShareLocation() {
	}
	
	public ShareLocation(int iD, String longitude, String latitude,
			String pubdate, String userdetailID) {
		ID = iD;
		this.longitude = longitude;
		this.latitude = latitude;
		this.pubdate = pubdate;
		this.userdetailID = userdetailID;
	}

	public ShareLocation( String longitude, String latitude, String pubdate,String userdetailID) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.pubdate = pubdate;
		this.userdetailID = userdetailID;
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
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getUserdetailID() {
		return userdetailID;
	}
	public void setUserdetailID(String userdetailID) {
		this.userdetailID = userdetailID;
	}
	@Override
	public String toString() {
		return "Location [ID=" + ID + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", pubdate=" + pubdate + "]";
	}
	
}
