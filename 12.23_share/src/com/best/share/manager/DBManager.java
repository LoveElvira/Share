package com.best.share.manager;

import java.util.ArrayList;
import java.util.List;

import com.best.share.bean.GroupChat;
import com.best.share.bean.ShareLocation;
import com.best.share.db.DataBaseHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * 数据库管理
 * 
 * */

public class DBManager {
	private DataBaseHelper mHelper;
	private Context mContext;
	public DBManager(Context context){
		this.mHelper = new DataBaseHelper(context);
		this.mContext = context;
	}
	//插入数据
	public void insertLocation(ShareLocation s){
		//方式一
		SQLiteDatabase db = mHelper.getWritableDatabase();//得到写入的数据
		ContentValues cv = new ContentValues();//实例化  一个  存放数据的控件
		cv.put("longitude", s.getLongitude());//添加经度
		cv.put("latitude", s.getLatitude());//添加纬度
		cv.put("pubdate", s.getPubdate());//添加更新时间
		cv.put("userdetailID", s.getUserdetailID());//添加用户的ID
		//参数  （表名，允许为空的列是为了保证ContentValues没有的数据，插入的数据）
		db.insert(DataBaseHelper.TABLE_LOCATION, null, cv);
		/*方式二
		 * String sql = "insert into "+DataBaseHelper.TABLE_NAME+" (name,age) values('haha',12)";
		 * db.execSQL(sql);
		 * */
	
		db.close();
	}
	//查询最后的一条数据
	public ShareLocation selectLocation(){
		ShareLocation s = null;
		SQLiteDatabase db = mHelper.getReadableDatabase();
		Cursor c = db.rawQuery("select * from "+DataBaseHelper.TABLE_LOCATION+" order by _id desc limit 1", null);
		if(c.moveToFirst()){//是否查询到数据
			Log.i("sqlite",c.getCount()+"......");
			int _id = c.getInt(0);
			String longitude = c.getString(1);
			String latitude = c.getString(2);
			String pubdate = c.getString(3);
			String userdetailID = c.getString(4);
			s = new ShareLocation(_id,longitude,latitude,pubdate,userdetailID);
		}
		return s;
	}
	
	
	public void insertChat(GroupChat gc){
		//方式一
		SQLiteDatabase db = mHelper.getWritableDatabase();//得到写入的数据
		ContentValues cv = new ContentValues();//实例化  一个  存放数据的控件
		cv.put("chatID", gc.getChatID());//添加经度
		cv.put("pubdate", gc.getPubdate());//添加纬度
		cv.put("chatlook", gc.getChatlook());//添加更新时间
		cv.put("chattext", gc.getChattext());//添加用户的ID
		//参数  （表名，允许为空的列是为了保证ContentValues没有的数据，插入的数据）
		db.insert(DataBaseHelper.TABLE_GROUPCHAT, null, cv);
		/*方式二
		 * String sql = "insert into "+DataBaseHelper.TABLE_NAME+" (name,age) values('haha',12)";
		 * db.execSQL(sql);
		 * */
	
		db.close();
	}
	//查看所有的数据
	public List<GroupChat> selectChat(){
		List<GroupChat> gc = new ArrayList<GroupChat>();
		SQLiteDatabase db = mHelper.getReadableDatabase();
		Cursor c = db.rawQuery("select * from "+DataBaseHelper.TABLE_GROUPCHAT+" order by _id desc", null);
		if(c.moveToFirst()){//是否查询到数据
			Log.i("sqlite",c.getCount()+"......");
			for(int i=0;i<c.getCount();i++){//把游标进行了遍历
				c.moveToPosition(i);//移动到指定的记录
				int _id = c.getInt(0);
				String chatID = c.getString(1);
				String pubdate = c.getString(2);
				String chatlook = c.getString(3);
				String chattext = c.getString(4);
				gc.add(new GroupChat(_id,chatID,pubdate,chatlook,chattext));
			}
		}
		return gc;
	}
}
