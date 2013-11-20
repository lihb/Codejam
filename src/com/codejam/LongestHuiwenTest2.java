package com.codejam;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestHuiwenTest2 {

	@Test
	public void testGetAllIndex() {
		Integer[] a = LongestHuiwen.getAllIndex("feeesdswddasde", 'e'); 
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}

}
