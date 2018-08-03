package com.basha.JunitTestDemoMain;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.basha.JunitTestDemo.CalcMethods;

public class TestCaseCalcMethods {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("brfore class");
	}
	
	@Before
	public void setUp() throws Exception{
		System.out.println("before");
	}
	
	@Test
	public void testFindMax(){
		System.out.println("test case find max");
		assertEquals(9, CalcMethods.findMax(new int[]{2, 5, 7, 9, 1}));
		//assertEquals(-2, CalcMethods.findMax(new int[]{-4, -12, -3, -5}));
	}
	
	@Test
	public void testCube(){
		System.out.println("test case to find the cube");
		assertEquals(27, CalcMethods.cube(3));
	}
	
	@Test
	public void testReverseWord(){
	    System.out.println("test case reverse word");  
        //assertEquals("ym eman si nahk",CalcMethods.reverseWord("my name is khan"));  
        assertEquals("edcba",CalcMethods.reverseWord("abcde")); 
	}
	@After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
  
}
