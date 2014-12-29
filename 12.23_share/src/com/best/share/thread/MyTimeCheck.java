package com.best.share.thread;

public abstract class MyTimeCheck {
	//次数
	private int mCount = 0;
	//检查次数
	private int mTimeOutCount = 1;
	//睡眠时间
	private int mSleepTime = 1000;
	//是否退出
	private boolean mExitFlag = false;
	//
	private Thread mThread = null;
	public abstract void doTimeCheckWork();
	public abstract void doTimeOutWork();
	public MyTimeCheck(){
		mThread = new Thread(new Runnable() {
			
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
							exit();
						}
					}else{
						doTimeOutWork();
					}
				}
			}
		});
	}
	public void start(int timeOutCount,int sleepTime){
		mTimeOutCount = timeOutCount;
		mSleepTime = sleepTime;
		mThread.start();
	}
	public void exit() {
		// TODO Auto-generated method stub
		mExitFlag = true;
	}
}
