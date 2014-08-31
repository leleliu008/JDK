package com.leleliu008.jdk5.Concurrent;

/**
 * 守护线程测试
 * @author leleliu008
 * @date 2012.12.15
 */

public class DaemonThreadTest {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		});
		//设置为守护线程
		//由于此线程是在main线程中创建的，而main线程是用户线程，所以如果不显示声明为守护线程，就是用户线程
		thread.setDaemon(true);
		thread.start();
	}
}