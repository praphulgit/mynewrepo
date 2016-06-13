package com.renovite.concurency.semaphore;

import java.util.concurrent.Semaphore;

public class PrintQueue {

	private final Semaphore semaphore;

	public PrintQueue() {
		semaphore = new Semaphore(1);
	}

public void printJob(Object document) {

		try {
			semaphore.acquire();

			long duration = (long) (Math.random() * 10);
			System.out.printf("%s: PrintQueue: Printing a Job during %d seconds\n", Thread.currentThread().getName(),
					duration);
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}

class Job implements Runnable {
	private PrintQueue printQueue;

	public Job(PrintQueue printQueue) {
		this.printQueue = printQueue;
	}

	@Override
	public void run() {
		System.out.printf("%s: Going to print a job\n", Thread.currentThread().getName());
		printQueue.printJob(new Object());
		System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());

	}
}
