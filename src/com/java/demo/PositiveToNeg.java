package com.java.demo;

public class PositiveToNeg {
	public void Positive(int number) {
		if (number > 0) {
			System.out.println("the given number is positive ");
		}
		else {
			System.out.println("the given number is negative ...");
		}
		
	}
	public static void main(String args[]){
		int number=-6;
		PositiveToNeg obj = new PositiveToNeg();
		obj.Positive(number);
		
	}
}
