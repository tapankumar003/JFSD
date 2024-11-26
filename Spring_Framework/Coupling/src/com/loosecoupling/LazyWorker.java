package com.loosecoupling;

public class LazyWorker implements Iworker {

	@Override
	public void work() {
		System.out.println("Lazy Worker!");
	}

}
