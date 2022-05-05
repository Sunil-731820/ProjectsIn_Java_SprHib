package com.java.jstl;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int range;
		    range = sc.nextInt();
		    int num[] =  new int[range];
		    for(int i=0;i<range;i++){
		        num[i] = sc.nextInt();
		    }
		    int counter = 0;
		    for(int i=0;i<range;i++){
		        if(num[i]%10==2 && num[i]%10==3 && num[i]%10==9){
		            counter++;
		        }
		    }
		    System.out.println(counter);
		}
	}

}
