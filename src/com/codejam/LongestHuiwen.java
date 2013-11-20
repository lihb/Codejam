package com.codejam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestHuiwen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sdfrgwoshidashabibahsadihsfjutyeeeea";
		
		String longestHuiwen= getLongest(str);
		if (longestHuiwen==null) {
			System.out.println("No huiwen");
		}else {
			System.out.println(longestHuiwen+" "+longestHuiwen.length());
		}
		
	}

	private static String getLongest(String str) {
		// TODO Auto-generated method stub
		int max = 0;
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			Integer[] index = getAllIndex(str, ch);
			String subStr = "";
			for (int j = 0; j < index.length&&i<index[j]+1; j++) {				
				subStr = str.substring(i,index[j]+1);
				if(isHuiwen(subStr)){
					max = max<(index[j]+1-i)?(index[j]+1-i):max;
					map.put(index[j]+1-i, subStr);
					break;
				}
			}
			 
			
		}
		return map.get(max);
	}
	
	public static boolean isHuiwen(String str) {
		
		int i=0,j=str.length()-1;
		if (i>j) {
			return false;
		}else {
			while(i<=j){
				if (str.charAt(i++)!=str.charAt(j--)) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static Integer[] getAllIndex(String str,char ch){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int postIndex = str.lastIndexOf(ch);
		int preIndex=0;
		
		if (postIndex==-1) {
			list.add(-1);
		}else {
			list.add(postIndex);
		}
		
		while(true){
			preIndex = str.lastIndexOf(ch, postIndex-1); 
			if (preIndex==-1) {
				break;
			}
			list.add(preIndex);
			postIndex = preIndex;
			preIndex = str.lastIndexOf(ch, postIndex);
		}
		
		return list.toArray(new Integer[0]);
	}

}
