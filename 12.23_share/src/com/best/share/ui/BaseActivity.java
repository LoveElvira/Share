package com.best.share.ui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity{
	/**
	 * @Fields field : TODO (统一管理 Activity)
	 */  
	private List<Activity> mActivityManager = new ArrayList<Activity>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initView();
	}

	/**
	 * @Title: enclosing_method
	 * @Description: TODO(添加Activity 统一进行管理)
	 * @param: Activity a
	 * @return: void
	 */
	protected void addActivity(Activity a){
		mActivityManager.add(a);
	}
	
	//private abstract void initView();
	/**
	 * @Title: enclosing_method
	 * @Description: TODO(关闭整个程序)
	 * @param: void
	 * @return: void
	 */ 
	protected void closeAplication(){
		for(Activity a : mActivityManager){
			a.finish();
		}
	}
	/**
	 * @Title:enclosing_method
	 * @Description: TODO(初始化 View 界面的抽象方法)
	 * @param: void
	 * @return: void
	 */
	protected abstract void initView();
}
