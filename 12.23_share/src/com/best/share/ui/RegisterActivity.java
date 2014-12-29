package com.best.share.ui;

import com.best.share.R;

import android.view.Window;

public class RegisterActivity extends BaseActivity{

	@Override
	protected void initView() {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_zhuce);
		addActivity(this);
	}
	
}
