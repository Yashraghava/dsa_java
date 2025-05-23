package com.java.latest_version;

import java.util.concurrent.TimeUnit;

class SleepingThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}