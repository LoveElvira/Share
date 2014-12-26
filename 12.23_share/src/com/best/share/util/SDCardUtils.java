package com.best.share.util;

import java.io.File;

import android.os.Environment;

public class SDCardUtils {
	public static boolean isExistSDCard() {
		if (Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {
			return true;
		}
		return false;
	}

	/**
	 * 创建应用目录
	 * 
	 * @return
	 */
	public static String createAppDir() {
		File file = new File(Environment.getExternalStorageDirectory()
				+ "/share");
		if (!file.exists()) {
			file.mkdir();
		}
		return file.getAbsolutePath();
	}
}
