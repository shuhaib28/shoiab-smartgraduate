package helloworld;

import java.util.Scanner;

public class withoutscanner {
	public static void main(String[] args) {
	int i;
	System.out.println("enetr an interger");
	Scanner f= new Scanner(System.in);
	i=f.nextInt();
	if(i%2==0)
		System.out.println("the number is even");
	else
		System.out.println("the entered number is odd");
			
	}

}
