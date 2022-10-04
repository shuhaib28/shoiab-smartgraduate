package helloworld;

public class Swaptwonumbers {
	public static void main(String[] args) {
		float first=2.50f;
		float second=4.50f;
		System.out.println("before swap");
		System.out.println("first number=" +first);
		System.out.println("second number="+second);
		float permanent=first;
		first=second;
		second =permanent;
		System.out.println("after swap");
		System.out.println("first number=" +first);
		System.out.println("second number="+second);
		}

}
