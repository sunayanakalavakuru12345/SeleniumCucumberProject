package com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	@Test
	public void test() {
		System.out.println("test");
	}
	@BeforeMethod
	public void internetexp() {
		System.out.println("in ie page");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("in after method");
	}
	@BeforeTest
	public void beforetest() {
	System.out.println("in before test");	
	}
	@AfterTest
	public void aftertest() {
	System.out.println("in after test");	
	}
	@BeforeClass
	public void beforeclass() {
	System.out.println("in before class");	
	}
	@AfterClass
	public void afterclass() {
	System.out.println("in after class");	
	}
	
	@BeforeSuite
	public void beforesuitt() {
	System.out.println("in before suit");	
	}
	@AfterSuite
	public void aftersuit() {
	System.out.println("in aftersuit");	
	}
}
