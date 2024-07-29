package com.velan.testsample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.velan.testsample.App;

class AppTest {
	
	public AppTest() {
		super();
	}
	@Test
	void testCompareString() {
		assertEquals(1, App.compareString("vela", "vela"));
	}
	@Test
	void testCompareString1() {
		assertEquals(0, App.compareString("VELA", "vela"));
	}
}
