package helloworld;

import java.util.Scanner;

public class Floydtraiangle {
	public static void main(String[] args) {
		int rows,number=1,counter,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows for floyd's triangle:");
		rows=input.nextInt();
		input.close();
		System.out.println("floyd's triangle");
		System.out.println("****************");
		for(counter=1;counter<=rows;counter++)
		{
			for(j=1;j<=counter;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	
	}

}
