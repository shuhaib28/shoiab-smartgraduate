package helloworld;

import java.util.Scanner;

public class reversenumber {
	public static void main(String[] args) {
		int num =0;
		int reversenum=0;
		System.out.println("input your number and press enter:");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		in.close();
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("reverse of the given number is:"+reversenum);
		}

}
