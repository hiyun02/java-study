package baekjoon;

import java.util.Scanner;

public class q11720 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		String str = s.next();

		int result = 0;
		for (int i = 0; i < n; i++) {
			result += str.charAt(i) - '0';
			
		}
		System.out.println(result);
	}

}
