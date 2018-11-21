package com.rv.code;

public class JavaThreadOne {

	
	
	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			MyThreadCreator myth = new MyThreadCreator();
			Thread rythm = new Thread(new MyRunnableThreadCreator());
			myth.setName("myth_"+i);
			rythm.setName("rythm_"+i);
			rythm.start();
			myth.start();
		}
	}
}


class MyThreadCreator extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class MyRunnableThreadCreator implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	
}