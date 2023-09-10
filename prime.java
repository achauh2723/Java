package packages;
import java.util.Scanner;

//class prime {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a number to check if it is truly prime number or not: ");
//        int number= sc.nextInt();
//        if(isPrime(number)) {
//            System.out.println(number + " is prime number");
//        }
//        else{
//            System.out.println(number + " is a non-prime number");
//        }
//    }
// static boolean isPrime(int num){
//        if(num<=1){
//            return false;
//        }
//       for(int i=2;i<=num/2;i++){
//           if((num%i)==0) 
//               return  false;
//       }
//       return true;
//    }
//}
//



class prime{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num+"number is prime");
		}
		else{
			System.out.println(num+"number is not prime");
		}
	}


static boolean isPrime(int num) {
	if(num<=1) {
		return false;
	}
	for(int i=2;i<=num/2;i++) {
		if((num%i)==0)
		return false;
	}
		return true;
	}
}























