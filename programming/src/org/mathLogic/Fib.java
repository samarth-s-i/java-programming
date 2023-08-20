package org.mathLogic;
class Fib{
	public static void main(String[] args){
		int n1=0;
		int n2=1;
		int res=0;
		for(int i=0;i<5;i++){
			if(i==2)
				System.out.println("1");
			else{
				System.out.println(res);
				res=n1+n2;
				n1=n2;
				n2=res;
			}
		}
	}
}