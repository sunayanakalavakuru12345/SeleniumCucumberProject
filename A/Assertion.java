package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	/*softAssertion*/
	@Test
public void assertfunction() {
	SoftAssert ast=new SoftAssert();
	System.out.println("first assertion");
	 ast.assertEquals(5, 5);
	System.out.println("second assertion");
	ast.assertTrue(5>10);
	System.out.println("third assertion");
	ast.assertEquals("kim", "kim");
	ast.assertAll();
	}
	@Test
	/* Hard Assertion*/
	public void assertfun() {
		System.out.println("first assertion");
		 Assert.assertEquals(5, 5);
		System.out.println("second assertion");
		Assert.assertTrue(5>10);
		System.out.println("third assertion");
		Assert.assertEquals("kim", "kim");
	}
}