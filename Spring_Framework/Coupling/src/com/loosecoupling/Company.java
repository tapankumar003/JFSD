package com.loosecoupling;

public class Company {
	public static void main(String[] args) {
		LazyWorker lw = new LazyWorker();
		SmartWorker sw = new SmartWorker();
		Manager m = new Manager(lw);
		Manager m1 = new Manager(sw);

	}

}
