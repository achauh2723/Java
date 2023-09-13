//factorial of number
package packages;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int a,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		a = sc.nextInt();
        for(int i=1;i<=a;i++) {
        	fact=fact*i;
        }
        System.out.println("factorial of"+a+ "is"+fact);
	}

}
