package com.codejam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream((new File("d:\\programDATA\\B\\C-large-practice.in")));
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//Scanner in = new Scanner(new File("e:\\LHB\\jam\\sort\\A-small-practice-1.in"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\B\\C-large-practice.out")));
		
		int T = Integer.parseInt(br.readLine());
		for (int curr = 1; curr <= T; curr++) {
			
			System.out.printf("Case #%d:", curr);
			int N = Integer.parseInt(br.readLine());
			int[] a = new int[N];
			String[] input = br.readLine().split(" ");
			
			for (int i = 0; i < input.length; i++) {
				a[i] = Integer.parseInt(input[i]);
			}
			
			int[] odd ,even;
			int odd_len=0,even_len=0;
			
			for (int i = 0; i < N; i++)
				if (a[i]%2==0) 
					even_len++;
			for (int i = 0; i < N; i++)
				if (a[i]%2!=0) 
					odd_len++;
			odd=new int[odd_len];even = new int[even_len];
			int m=0,n=0;
			for (int i = 0; i < N; i++){
				if (a[i]%2!=0) 
					odd[m++] = a[i];
				else
					even[n++] = a[i];
			}
			
			{
				m=even_len-1;n=0;
				Arrays.sort(odd);Arrays.sort(even);
				for (int i = 0; i < N; i++) {
					if (a[i]%2 == 0&&m>=0) 
						a[i] = even[m--];
					else
						a[i] = odd[n++];
				}
			}
			for (int i = 0; i < input.length; i++) {
				System.out.printf(" %d",a[i]);
			}
			
				
		
			
			System.out.println();
			
		}
		

	}

}
