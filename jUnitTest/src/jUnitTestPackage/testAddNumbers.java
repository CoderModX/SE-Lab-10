package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(100, 200);
		assertEquals(300, result);
	}
	
	@Test
	public void test2() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(101, 200);
		assertEquals(300, result);
	}
}
