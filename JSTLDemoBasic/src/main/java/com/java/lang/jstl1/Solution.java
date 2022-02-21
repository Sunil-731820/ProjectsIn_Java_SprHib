package com.java.lang.jstl1;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array ");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("t \n");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
//		for(int j=0;j<n;j++) {
//		System.out.println(a[j] + " ");	
//		}
		
	}

}
