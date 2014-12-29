package com.best.share.bean;
/**
 * 查询用户数据实体类
 * */
public class Register{
	private String ID;
	private String userName;
	private String password;
	public Register() {
		super();
	}
	public Register(String iD, String userName, String password) {
		super();
		ID = iD;
		this.userName = userName;
		this.password = password;
	}
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the username
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param username the username to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
