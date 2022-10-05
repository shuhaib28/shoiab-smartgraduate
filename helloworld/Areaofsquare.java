package helloworld;

import java.util.Scanner;

public class Areaofsquare {
	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		System.out.println("enter the area of side:");
		double side1=scanner.nextDouble();
		scanner.close();
		double area=side1*4;
		System.out.println("the area of square is:"+area);
		}

}
