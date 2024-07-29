package com.velan.testsample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.velan.testsample.App;

public class TestApp {
	
	//Sum of the Array Test
	@Test
	public void testSum() {
		int arr[]={1,2,3,4};
		assertEquals(10,App.sum(arr));
	}

	//Compare String Using Boolean Function Test
	@Test
	public void testCompare() {
		assertTrue(App.compareString1("vela", "vela"));
	}
	@Test
	public void testCompare1() {
		assertFalse(App.compareString1("VELA", "vela"));
	}
	
	// Sum of the digit Test
	@Test
	public void testSumOfDigit() {	
		assertEquals(6,App.sumOfDigit(123));
	}
	
	//Maximum Value of the Digits Test
	@Test
	public void testMaxOfDigit() {	
		assertEquals(6,App.maxOfDigit(563));
	}
	
	//Increasing Order of Digit Test
	@Test
	public void testIncOrder() {
		assertTrue(App.incOrderOfDigit(678));
	}
	@Test
	public void testIncOrder1() {
		assertFalse(App.incOrderOfDigit(687));
	}

	//Fibonacci Series Test
	@Test
	public void testfibonacci(){
		assertEquals(34,App.fibonacci(10));
	}
	
	//Prime Number Test
	@Test
	public void testprime(){
		assertEquals(0,App.prime(11));
	}
	@Test
	public void testprime1(){
		assertEquals(1,App.prime(10));
	}
	 
}
