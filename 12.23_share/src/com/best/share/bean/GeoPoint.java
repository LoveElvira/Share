package com.best.share.bean;
/**
 * 存放用户人的地理位置
 * */
public class GeoPoint {
	private String longitude;//经度
	private String latitude;//纬度
	private String shareID;//分享表（Share）的ID
	public GeoPoint() {
	}
	public GeoPoint(String longitude, String latitude, String shareID) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.shareID = shareID;
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
	public String getShareID() {
		return shareID;
	}
	public void setShareID(String shareID) {
		this.shareID = shareID;
	}
}
