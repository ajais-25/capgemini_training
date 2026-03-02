package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JunitTest {
	static Junit j = new Junit();
	
	@BeforeEach
	public void start() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void end() {
		System.out.println("After Each");
	}
	
	@BeforeAll
	public static void startAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void endAll() {
		System.out.println("After All");
	}

	@Test
	void addTest() {
		int actual = j.add(1, 4);
		int expected = 5;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void reverseTest() {
		String actual = j.reverse("abcd");
		String expected = "dcba";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void mulTest() {
		int actual = j.mul(4, 21);
		int expected = 84;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void evenTest() {
		assertTrue(j.even(4));
	}
	
	@Test
	void arrayTest() {
		try {
			int[] arr = null;
			
			for(int i = 0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (NullPointerException e) {
			System.out.println("Exception Handled");
		}
	}
	
	@Test
	void revTest() {
		String actual = j.reverse("abcd");
		String expected = "dcba";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void sumTest() {
		int[] arr = {1, 2, 3, 4, 5};
		int actual = j.sum(arr);
		int expected = 15;
		
		assertEquals(expected, actual);
	}
}
