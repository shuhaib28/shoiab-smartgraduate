package helloworld;

import java.util.Scanner;

public class Whileloop {
	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("please enter any integer below 10:");
		number=sc.nextInt();
		sc.close();
		while(number<=10) {
			sum=sum+number;
			number++;
		}
		System.out.format("sum of the numbers from the while loop is: %d",sum);
	}

}
