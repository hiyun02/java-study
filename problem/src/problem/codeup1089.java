package problem;

import java.util.Scanner;

public class codeup1089 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int d=s.nextInt();
		int n=s.nextInt();
		long result = a+(n-1)*d;
		System.out.println(result);
	}

}
