package com.loosecoupling;

public class Manager {
	Iworker iw;

	public Manager(Iworker iw) {
		iw.work();
	}
}
