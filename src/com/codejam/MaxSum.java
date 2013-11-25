package com.codejam;
/**
 * 最大连续子数组
 * 
 * */

public class MaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,-2,3,4,-1,4,-3,6};
		
		int nStart = input[0];
		int nAll = input[0];
		
		for (int i = 1; i < input.length; i++) {
			nStart = max(input[i],nStart + input[i]);
			nAll = max(nStart,nAll);
		}
		System.out.println(nAll);

	}

	private static int max(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1>num2?num1:num2;
	}

}
