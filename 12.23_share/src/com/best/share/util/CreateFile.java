package com.best.share.util;

import java.io.File;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

/**
 * 创建文件存放目录
 * */
public class CreateFile {
	private Context mContext;
	private String mPathString = Environment.getExternalStorageDirectory().getPath()+"//";
	private String mName;
	private String mNames;
	private String mLocation = "//location.text";
	private String mGroupchat = "//groupchat.text"; 
	private static final int FLAG = 0x01;
	public CreateFile(Context context){
		
		
		this.mContext = context;
		boolean ss = Environment.getExternalStorageState()
		 .equals(android.os.Environment.MEDIA_MOUNTED);
		if(ss){
			Toast.makeText(context, "有SD卡",FLAG).show();
			CreateSdDir();
		}else{
			Toast.makeText(context, "无SD卡",FLAG).show();
		}
		
	}
	public void CreateSdDir(){
		if(Environment.getExternalStorageDirectory().getPath()==null){
			mName = "//share";
			Log.i("父目录1",mName);
		}else{ 
			mName = "share";
			Log.i("父目录2",mName);
		}
		mNames = mPathString+mName;
		File fname = new File(mNames);
		File fapp = new File(mNames+mLocation);
		File fmusic = new File(mNames+mGroupchat);

		//判断该文件夹是否存在,已存在则不创建
		if(!fname.exists()){
			createSDDir(mNames);
			Log.i("创建name","===");
		}
		if(!fapp.exists()){
			createSDDir(mName+mLocation);
			Log.i("创建name","===");
		}
		if(!fmusic.exists()){
			createSDDir(mName+mGroupchat);
			Log.i("创建name","===");
		} 
		
		Log.i("app目录",mPathString+"");
		Log.i("app目录",fname.exists()+"");
	}
	public File createSDDir(String dirName){
		File dir = new File(mPathString + dirName);
		dir.mkdir();
		return dir;
	}
}
