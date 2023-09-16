// printing largest number from three number

package packages;

import java.util.Scanner;

public class largestno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no:");
		int a = sc.nextInt();
		System.out.println("Enter the second no:");
		int b = sc.nextInt();
		System.out.println("Enter the third no:");
		int c = sc.nextInt();
		if(a<b&&c<b) {
			System.out.println("second no is largest"+ b);
		}
		else if(b<a&&b<a){
			System.out.println("first no is largest"+ a);
		}
		else{
			System.out.println("third no is largest"+ c);
		}
	}

}
