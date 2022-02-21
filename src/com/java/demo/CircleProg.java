package com.java.demo;

public class CircleProg {
	public void area(int radius) {
		double area = 3.14*radius*radius;
		System.out.println("area is " + area);
	}
	public void peri(int radius) {
		double perimeter = 2*3.14*radius;
		System.out.println("the perimeter is "+ perimeter);
	}
	public static void main(String args[]) {
		int radius = 5;
		CircleProg obj = new CircleProg();
		obj.area(radius);
		obj.peri(radius);
	}

}
