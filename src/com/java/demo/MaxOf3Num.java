package com.java.demo;

public class MaxOf3Num {
	public void check(int a, int b, int c){
		int max = a;
		if (max<b) {
			max = b;
		}
		if(max<c) {
			max = c;
		}
		System.out.print("the maximum values of the three number is " + max );
		
	}
	public static void main(String args[]) {
		int a , b, c;
		a = 5;
		b = 7;
		c = 3;
		MaxOf3Num obj = new MaxOf3Num();
		obj.check(a, b, c);
	}

}
