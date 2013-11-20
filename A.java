package com.codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
	

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(new File("d:\\programDATA\\phoneNumber\\A-small-practice.in"));
		//System.setOut(new PrintStream(new File("d:\\programDATA\\phoneNumber\\A-small-practice.out")));
		part("15012233444", "3-4-4");
		

	}
	
	private static void part(String phoneNum,String str){
		
		String[] a = str.split("-");
		
		String[] b = new String[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i]="";
		}
		
		int k=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < Integer.parseInt(a[i])&&k<phoneNum.length(); j++,k++) {
				b[i] += phoneNum.charAt(k);
			}
			System.out.println(b[i]);
		}
	}
	
	private static void read(String[] str){
		String outStr ="";
		int num=1;
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			for (int j = 0; j < s.length()-1; j++) {
				if (s.charAt(j)==s.charAt(j+1)) {
					num++;
				}
			}
			
		}
	}
	
	public static String  toStr(char ch){
		String outStr="";
		switch (ch){
		case 0:
			outStr+=" zero";
			break;
		case 1:
			outStr+=" one";
			break;
		case 2:
			outStr+=" two";
			break;
		case 3:
			outStr+=" three";
			break;
		case 4:
			outStr+=" four";
			break;
		case 5:
			outStr+=" five";
			break;
		case 6:
			outStr+=" six";
			break;
		case 7:
			outStr+=" seven";
			break;
		case 8:
			outStr+=" eight";
			break;
		case 9:
			outStr+=" nine";
			break;
		default:
			break;
		}
		return outStr;
	}
	

}
