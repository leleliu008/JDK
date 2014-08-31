package com.leleliu008.exception;

/**
 * 内存模型原理-线程与栈
 * @author leleliu008
 * @date 2012.12.22
 */

public class Theory {

	public static void main(String[] args) {
		
		new Theory().startThread();
		
	}
	
	private void startThread() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//to do something
			}
		}).start();
	}
}
