package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result =  junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);;
	}
	
	@Test
	public void test2() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result =  junitstring.addStrings("capstne", "project");
		assertEquals("capstoneproject", result);;
	}
}
