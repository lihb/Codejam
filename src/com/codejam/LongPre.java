package com.codejam;
/**
 * 字符串A连续包含字符串B字符的最大值
 * 
 * 
 * */

public class LongPre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "abcdeabcdesadescridescripition";
		String B = "descripition";
		
		String str = getLongPre(A, B);
		System.out.println(str);
	}
	
	private static String getLongPre(String A, String B){
		
		int i=0,count=1;
		while (i<A.length()) {
			int j=0;
			if (A.charAt(i)==B.charAt(j)) {
				while((i<A.length()-1)&&(j<B.length()-1)&&(A.charAt(++i)==B.charAt(++j)))
					//count = count<j+1?j+1:count;
					count = j+1;
			}else {
				i++;
			}
		}
		String str = B.substring(0,count);
		return str;
	}

}
