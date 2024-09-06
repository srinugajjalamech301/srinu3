package sama;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);

		System.out.println("Enter any word");

		String abc = ab.next().toString();
		
		//System.out.println(abc.charAt(6));
		//System.out.println(abc.charAt(5));
		int ss = abc.length();
		
	

		for (int i = ss-1; i > 1; i--) {

			System.out.println(abc.charAt(i));

		}

	}
}
