package com.best.share.ui;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.FindListener;

import com.best.share.R;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.best.share.bean.Register;
import com.best.share.thread.MyTimeCheck;
import com.best.share.util.NetWorkUtil;

import android.widget.EditText;

public class MainActivity extends BaseActivity implements OnClickListener{
	Button register,login;
	EditText username,password;
	static Context context;
	String[] uname = null,upass = null;
	int judge=1;
	static ProgressDialog pd;
	List<Register> userinfo;
	boolean panduan = true;
	SharedPreferences sp;
	@Override
	protected void initView() {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		context = this;
		register = (Button) findViewById(R.id.btn_yonghu_zhuce);
		login = (Button) findViewById(R.id.login_login_btn);
		username = (EditText) findViewById(R.id.login_user_edit);
		password = (EditText) findViewById(R.id.login_passwd_edit);
		register.setOnClickListener(this);
		login.setOnClickListener(this);
		//获取记住的密码
		sp = getSharedPreferences("NBA", 0);
		String users=null,passs=null;
		if(sp != null){
			users = sp.getString("usernames","");
			passs = sp.getString("passwords","");
		}
		  
		//判断是否有记录过的登陆信息
		if (!("".equals(users)) && !("".equals(passs))) {
			//如果有登陆过的信息直接进入主页面
			Intent intent1 = new Intent(context,RegisterActivity.class);
			startActivity(intent1);
			finish();
		}

		
		//sp = getSharedPreferences("userInfo", Context.MODE_WORLD_READABLE);
		//添加Activity 进行统一的管理
		addActivity(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_yonghu_zhuce:
			//跳转注册页面
			Intent intent = new Intent(context,RegisterActivity.class);
			startActivity(intent);
			break;
		case R.id.login_login_btn:
			//判断是否联网  
			if(NetWorkUtil.isNetWorkAvailable(context)){
				//获取用户名，密码
				final String user = username.getText().toString();
				final String pass = password.getText().toString();
				pd = new ProgressDialog(context);
				pd.setMessage("正在拼命登录中");
				pd.show();
				MyTimeCheck mtc = new MyTimeCheck() {

					@Override
					public void doTimeCheckWork() {
						
						//从服务器中获取用户信息表
						BmobQuery<Register> query = new BmobQuery<Register>();
						query.findObjects(context, new FindListener<Register>(){

							@Override
							public void onError(int arg0, String arg1) {
								// TODO Auto-generated method stub
								Toast.makeText(context, "查询数据失败", Toast.LENGTH_LONG).show();
								System.out.println("查询数据失败");
							}  

							@Override   
							public void onSuccess(List<Register> arg0) {
								//userinfo = arg0;
								for(int i=0;i<arg0.size();i++){
									if(user.equals(arg0.get(i).getUserName())){
										if(pass.equals(arg0.get(i).getPassword())){
											Toast.makeText(context, "成功", Toast.LENGTH_LONG).show();
											panduan = true;
											break;
										}else{
											Toast.makeText(context, "密码不正确", Toast.LENGTH_SHORT).show();
											pd.dismiss();
											break;
										}
									}else{
										Toast.makeText(context, "用户名密码不正确...", Toast.LENGTH_SHORT).show();
										
										pd.dismiss();
										break;
									}
										
								}
							}
						});
						
						
						if(panduan){
							pd.dismiss();
							/*String userNameValue = username.getText().toString();
							String passwordValue = password.getText().toString();*/
							/*Bundle bundle = new Bundle();
							
							bundle.putString("usernames", user);
							bundle.putString("passwords", pass);*/
							
							Editor ed = sp.edit();
					    	ed.putString("usernames", user);
					    	ed.putString("passwords", pass);
					    	ed.commit();
							
							//记住用户名、密码、   
		                      /*Editor editor = sp.edit();   
		                      editor.putString("USER_NAME", userNameValue);   
		                      editor.putString("PASSWORD",passwordValue);   
		                      editor.commit(); 
							Intent intent = new Intent(context,RegisterActivity.class);
							startActivity(intent);*/
							this.exit();
							/*Message msg = new Message();
							msg.what = 1;
							msg.obj = judge;
							handler.sendMessage(msg);*/
						}else{
							pd.dismiss();
							//Toast.makeText(context, "用户名或密码不正确，请重新输入", Toast.LENGTH_LONG).show();
							System.out.println("用户名或密码不正确，请重新输入");
							this.exit();
						}
					}
  
					@Override
					public void doTimeOutWork() {
						// TODO Auto-generated method stub
						this.exit();
					}};
					mtc.start(15, 1000);
				
			}else{
				Toast.makeText(context, "请连接网络", Toast.LENGTH_LONG).show();
			}
		
			break;
		default:
			break;
		}
	}

}
