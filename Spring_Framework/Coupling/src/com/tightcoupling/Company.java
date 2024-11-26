package com.tightcoupling;

public class Company {
	public static void main(String[] args) {

		LazyWorker lw = new LazyWorker();
		SmartWorker sw = new SmartWorker();
		Manager m = new Manager(lw, sw);
		m.work();

	}

}
