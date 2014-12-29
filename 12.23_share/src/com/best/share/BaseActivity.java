package com.best.share;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.Bmob;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity{
	/**  
	 * @Fields field : TODO (统一管理 Activity)
	 */  
	private List<Activity> mactivityManager = new ArrayList<Activity>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bmob.initialize(this,"51ff662774475d3840344d8f8a37cac4");
		initView();
	}

	/**
	 * @Title: enclosing_method
	 * @Description: TODO(添加Activity 统一进行管理)
	 * @param: Activity a
	 * @return: void
	 */
	protected void addActivity(Activity a){
		mactivityManager.add(a);
	}
	
	//private abstract void initView();
	/**
	 * @Title: enclosing_method
	 * @Description: TODO(关闭整个程序)
	 * @param: void
	 * @return: void
	 */ 
	protected void closeAplication(){
		
	}
	/**
	 * @Title:enclosing_method
	 * @Description: TODO(初始化 View 界面的抽象方法)
	 * @param: void
	 * @return: void
	 */
	protected abstract void initView();
}
