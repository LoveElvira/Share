package com.best.share.bean;
/**
 * 存放群组的人的实体类
 */
public class Group {
	private String groupName;//群组的名字
	private String declaration;//群组的标签宣言
	private String groupID;//外键：用户详情（UserDetails）表的ID
	private String userDetailsID;//组内人的ID
	public Group() {
	}
	public Group(String groupName, String declaration, String groupID,
			String userDetailsID) {
		this.groupName = groupName;
		this.declaration = declaration;
		this.groupID = groupID;
		this.userDetailsID = userDetailsID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDeclaration() {
		return declaration;
	}
	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}
	public String getGroupID() {
		return groupID;
	}
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}
	public String getUserDetailsID() {
		return userDetailsID;
	}
	public void setUserDetailsID(String userDetailsID) {
		this.userDetailsID = userDetailsID;
	}
}
