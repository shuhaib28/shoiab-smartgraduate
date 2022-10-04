package helloworld;

import java.util.Scanner;

public class vowel1 {
	public static void main(String[] args) {
		System.out.println("enter a character:");
		Scanner input= new Scanner(System.in);
		char ch= input.next().charAt(0);
		input.close();
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("the given character is vowel");
		else
			System.out.println("the given character is consonant");
		
		
		}

}
