package helloworld;

import java.util.Scanner;

public class rectangle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the length of rectangle:");
		double length=scanner.nextDouble();
		System.out.println("enter the width of the rectangle:");
		double width=scanner.nextDouble();
		scanner.close();
		double area= length*width;
		System.out.println("the area of thr ractangle is:"+area);
	
	}

}
