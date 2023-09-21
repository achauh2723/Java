package packages;

public class removespace {

	public static void main(String[] args) {
		String str = "Hello World";
		str = str.replaceAll(" ","");

	System.out.println("String without space:"+str);
	}
}
