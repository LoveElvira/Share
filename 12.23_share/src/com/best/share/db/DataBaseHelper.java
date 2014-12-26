package com.best.share.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*
 * 创建与更新
 * */

public class DataBaseHelper extends SQLiteOpenHelper{

	public static final String DB_NAME = "share.db";
	public static final String TABLE_GROUPCHAT = "groupchat";
	public static final String TABLE_LOCATION = "location";
	private static final int VERSION = 1;
	
	public DataBaseHelper(Context context){
		super(context,DB_NAME,null,VERSION);
	}
	
	/*
	 * 在第一次调用DataBaseHelper助手类是会检查数据是否已经存在
	 * 如果不存在  那么会调用onCreate方法
	 * 所以，我们要在该方法中实现数据库的创建
	 * */
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
		String sql1 = "create table "+TABLE_LOCATION+" (_id integer primary key autoincrement,longitude text,latitude text,pubdate text,userdetailsID text)";
		String sql2 = "create table "+TABLE_GROUPCHAT+"(_id integer primary key autoincrement,chatID text,pubdate text,chatlook text,chattext text)";
		db.beginTransaction();
		db.execSQL(sql1);
		db.execSQL(sql2);
		db.setTransactionSuccessful();
		db.endTransaction();
	}

	/*
	 * 如果数据库版本发生变化，（通过检查数据库版本标记），如果版本标记不一致
	 * 那么会调用onUpgrade方法
	 * 所以，我们可以再该方法中实现数据库的更新操作
	 * */
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		if(newVersion>oldVersion){
			db.execSQL("DROP TABLE IF EXISTS "+TABLE_LOCATION);//如果这个表存在  就删除
			db.execSQL("DROP TABLE IF EXISTS "+TABLE_GROUPCHAT);//如果这个表存在  就删除
			String sql1 = "create table "+TABLE_LOCATION+" (_id integer primary key autoincrement,longitude text,latitude text,pubdate text,userdetailsID text)";
			String sql2 = "create table "+TABLE_GROUPCHAT+"(_id integer primary key autoincrement,chatID text,pubdate text,chatlook text,chattext text)";
			db.beginTransaction();
			db.execSQL(sql1);
			db.execSQL(sql2);
			db.setTransactionSuccessful();
			db.endTransaction();
		}
	}

}
