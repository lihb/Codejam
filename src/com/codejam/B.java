package com.codejam;
/**
 * Read Phone Number
 * 详见——————https://code.google.com/codejam/contest/2924486/dashboard
 * 
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("d:\\programDATA\\B\\B-large.in"));
		//Scanner in = new Scanner(new File("d:\\programDATA\\B\\test.txt"));
		System.setOut(new PrintStream(new File("d:\\programDATA\\B\\B-large.out")));
		List<Num> list = new ArrayList<Num>();
		list.add(0, new Num(0, 0));
		list.add(1, new Num(1, 1));
		Num num = new Num();
		for (long i = 2; i < Math.pow(2, 30); i++) {
			
			Num oldNum = list.get((int) (i/2));
			if (i%2 ==0) {
				num.setP(oldNum.getP());
				num.setQ(oldNum.getQ()+oldNum.getP());
				
			}else {
				num.setP(oldNum.getP()+oldNum.getQ());
				num.setQ(oldNum.getQ());
			}
			list.add((int) i,num);
		}
		
		int T = in.nextInt();
		for (int curr = 1; curr <= T; curr++) {
			int flag = in.nextInt();
			if (flag ==1) {
				int pos = in.nextInt();
				long p = list.get(pos).getP();
				long q = list.get(pos).getQ();
				System.out.printf("Case #%d: %d %d\n",curr,p,q);
			}
			if (flag==2) {
				long p =in.nextInt(),q =in.nextInt();
				Num num1 = new Num(p, q);
				int pos = list.indexOf(num1);
				
				System.out.printf("Case #%d: %d\n",curr,pos);
			}
				
		
		}
		
		
		
	}
	
	

}
