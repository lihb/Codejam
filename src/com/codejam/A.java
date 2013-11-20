package com.codejam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class A {
	
	private static String[] num =
		{"zero","one","two","three","four","five","six","seven","eight","nine"};
	private static String[] succ = 
		{"","","double","triple","quadruple","quintuple","sextuple","septuple","octuple","nonuple","decuple"};

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream in = new FileInputStream((new File("d:\\programDATA\\phoneNumber\\A-large-practice.in")));
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		System.setOut(new PrintStream(new File("d:\\programDATA\\phoneNumber\\A-large-practice.out")));
		
		char ch = '韩';
		System.out.println(ch);
		
		int T = Integer.parseInt(br.readLine());
		for (int curr = 1; curr <= T; curr++) {
			
			System.out.printf("Case #%d: ", curr);
			String[] input =br.readLine().split(" "); 
			String[] out = partion(input);
			output(out);
		}
	}
	
	private static String[] partion(String[] input) {
		String phoneNum = input[0];
		String[] format = input[1].split("-");
		String[] out = new String[format.length];
		for (int i = 0; i < out.length; i++) {
			out[i]="";
		}
		int k=0;
		for (int i = 0; i < format.length; i++) {
			for (int j = 0; j < Integer.parseInt(format[i]); j++) {
				out[i] += phoneNum.charAt(k++);
			}
		}
		return out;
	}
	
	private static void output(String[] out) {
		
		for (int i = 0; i < out.length; i++) {
			char ch = out[i].charAt(0);
			int count = 1;
			int j = 0;
			while (j < out[i].length()-1) {
				j++;
				if (ch ==out[i].charAt(j)) {
					count++;
				}else {
					if(count ==1)
						System.out.printf("%s ",num[ch-'0']);
					else if(count>10){
						for (int j2 = 0; j2 < count; j2++) {
							System.out.printf("%s ",num[ch-'0']);
						}
					}
						
					else
						System.out.printf("%s %s ",succ[count],num[ch-'0']);  // 打印前面出现的相同元素的个数
					ch = out[i].charAt(j);
					count = 1;
				}
			}
			
			if(count ==1)
				System.out.printf("%s ",num[ch-'0']);
			else if(count>10)
				System.out.printf("%s ",num[ch-'0']);
			else
				System.out.printf("%s %s ",succ[count],num[ch-'0']);
		}
		System.out.println();
	}
	

}
