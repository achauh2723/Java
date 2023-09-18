package packages;

public class sum2darray {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3,4},{3,5,6,7},{4,7,2,6}};
		int sum = 0;
		for(int[] row:arr) {
			for(int num:row) {
				sum+=num;
			}
			}
		System.out.println("Sum of array is :"+sum);
	}

}
