package helloworld;

import java.util.Scanner;

public class Areaoftraiangle {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the height of the triangle:");
		double height=scanner.nextDouble();
		System.out.println("enter the base of the triangle:");
		double base=scanner.nextDouble();
		scanner.close();
		double area=(height*base)/2;
		System.out.println("the area of triangle:"+area);
		
	}

}
