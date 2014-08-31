package com.leleliu008.jdk5.Concurrent;

/**
 * 线程池中线程可重复使用的原理
 * @author leleliu008
 * @date 2012.12.10
 */

public class Test {

	public static void main(String[] args) {
		
	}
}

class PooledThread extends Thread { 
	private Runnable theTask; // 要执行的任务 
   
	public void run() { 
		while(true) {      // 永不停止的循环 
			try {
				wait();    // 等待系统的通知 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			theTask.run(); // 执行任务 
		} 
	} 
} 
