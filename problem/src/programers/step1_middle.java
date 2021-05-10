package programers;

import java.util.Scanner;

public class step1_middle {
//
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String tmp=s.nextLine();
		System.out.println(Solution(tmp));
	}
	public static String Solution(String str) {
		return str.substring((str.length()-1)/2, str.length()/2+1 );
	}
}
