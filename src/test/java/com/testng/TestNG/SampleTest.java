package com.testng.TestNG;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(priority = -1)
	private void iPhone() {
		System.out.println("iphone");
	}
	@Test(invocationCount = 3)
	private void earPhone() {
		System.out.println("ear phone");
	}
	@Test(priority = 1)
	private void powerBank() {
		System.out.println("power bank");
	}
	@Test(enabled = false)
	private void dataCard() {
		System.out.println("data card");
	}
	@Test
	private void laptop() {
		System.out.println("Laptop");
	}
	@Test(priority = 0, expectedExceptions = NullPointerException.class)
	private void mstring() {
		String s= null;
		System.out.println(s.length());
	}
	@Test(timeOut = 2000)
	private void times() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("time");
	}
}
