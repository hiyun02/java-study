package problem;

import java.util.Scanner;

public class codeup1025 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int a = str.length();
		for(int i =0;i<a;i++)
			System.out.println("["+  (str.charAt(i)-'0') * (int)Math.pow( 10, a-(i+1) )  +"]" );
		
		
	}

}
