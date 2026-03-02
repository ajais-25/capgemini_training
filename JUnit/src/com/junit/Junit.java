package com.junit;

import java.util.Arrays;

public class Junit {
	public int add(int a, int b) {
		return (a+b);
	}
	
	public String reverse(String str) {
		String ans = "";
		
		for(int i = 0; i<str.length(); i++)
			ans = str.charAt(i) + ans;
		
		return ans;
	}
	
	public int mul(int a, int b) {
		return (a * b);
	}
	
	public boolean even(int n) {
		return ((n & 1) == 0);
	}
	
	public int[] array(int[] arr) {
		Arrays.sort(arr);
		
		return arr;
	}
	
	public String rev(String str) {
		String ans = "";
		
		for(int i = 0; i<str.length(); i++)
			ans = str.charAt(i) + ans;
		
		return ans;
	}
	
	public int sum(int[] arr) {
		int ans = 0;
		
		for(int i : arr)
			ans += i;
		
		return ans;
	}
}