// code to print longest value in string
package packages;

public class longeststring {

	public static void main(String[] args) {
		String[] arr = {"apple","banana", "cherry"};
	    String longest = "";
	    for(String str:arr) {
	    	if(str.length()>longest.length()) {
	    	longest = str;
	    }
	    }
	    System.out.println("longest string is:"+longest);
	}
}

