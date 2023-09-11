package packages;
import java.io.*;
import java.util.Scanner;

public class reverse {
	public static void main(String args[]) {
		String str= "Hello World";
		String rev= "";
		char ch;
		System.out.println("original string is" + str);
		for(int i=1;i<str.length();i++) {
			ch = str.charAt(i);
			rev = ch+rev;
		}
		System.out.println("Reversed string is:"+rev);
	}
}