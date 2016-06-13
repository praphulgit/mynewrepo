package com.renovite.concurency;

import java.util.concurrent.TimeUnit;

public class TaskFactory implements Runnable {
	
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
