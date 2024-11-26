package com.tightcoupling;

public class Manager {
	LazyWorker lw;
	SmartWorker sw;
	public Manager(LazyWorker lw, SmartWorker sw) {
		this.lw = lw;
		this.sw = sw;
	}
	void work() {
		System.out.println("manager!");
		lw.work();
		sw.work();
	}
}
