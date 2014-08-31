package com.leleliu008.exception;

/**
 * 运行时异常——工作线程中抛出运行时异常，不会导致奔溃，仅仅是工作线程退出
 * @author leleliu008
 * @date 2012.12.03
 */

public class Test4 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				throw new NullPointerException();
			}
		}).start();
		
		throw new NullPointerException();
	}
	
}