package packages;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		if(num % 2 == 0) 
			System.out.println(num + "Even number");
		else 
			System.out.println(num + "Odd number");
	}
}
