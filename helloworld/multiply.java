package helloworld;

import java.util.Scanner;

public class multiply {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value for i...:");
		int i=scan.nextInt();
		System.out.println("enter a value for j...:");
		int j =scan.nextInt();
		int multiply=i*j;
		System.out.println("the multiplication of i and j="+multiply);
	}

}
