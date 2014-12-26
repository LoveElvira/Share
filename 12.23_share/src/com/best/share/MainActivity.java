package com.best.share;

import android.view.Window;

public class MainActivity extends BaseActivity {

	@Override
	protected void initView() {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		//添加Activity 进行统一的管理
		addActivity(this);
	}

}
