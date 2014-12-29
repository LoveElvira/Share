package com.best.share.thread;
/*
 * 
 * 时间间隔的检测
 * 
 * */

public abstract class MyTimeCheck {
	private int mCount = 0;				//
	private int mTimeOutCount = 1;		//检查次数
	private int mSleepTime = 1000;		//时间间隔
	private boolean mExitFlag = false;	//检测退出标记
	private Thread mThread = null; 		//线程
	
	/*
	 * 检测的抽象方法
	 * 
	 * */
	public abstract void doTimeCheckWork();
	
	//超时  或  退出  时的方法
	public abstract void doTimeOutWork();
	
	//构造器
	public MyTimeCheck(){
		mThread = new Thread(new Runnable() {
			
			@SuppressWarnings("static-access")
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(!mExitFlag){
					mCount++;
					if(mCount<mTimeOutCount){
						doTimeCheckWork();
						try {
							mThread.sleep(mSleepTime);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							exit();//退出
						}
					}else{
						//超时
						doTimeOutWork();
					}
				}
			}
		});
	}
	//开始检测
	public void start(int timeOutCount,int sleepTime){
		mTimeOutCount = timeOutCount;
		mSleepTime = sleepTime;
		
		//开启线程
		mThread.start();
	}
	//退出
	public void exit(){
		mExitFlag = true;
	}
}
