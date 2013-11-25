package com.codejam;
/**
 * 辅助类，为A.java服务。
 * 
 * 
 * 
 * */

public class Num {
	 
			private  long p,q;
			public Num(){
				
			}
			
			public Num(long i,long j){
				p=i;
				q=j;
			}

			public long getP() {
				return p;
			}

			public void setP(long p) {
				this.p = p;
			}

			public long getQ() {
				return q;
			}

			public void setQ(long q) {
				this.q = q;
			}
			
			@Override
			public boolean equals(Object o) {
			// TODO Auto-generated method stub
				if (!(o instanceof Num))
					return false;
				Num n = (Num)o;
				return n.getP()==(p) && n.getQ()==(q);

			}
			
}
