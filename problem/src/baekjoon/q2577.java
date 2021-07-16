package baekjoon;

import java.util.Scanner;

public class q2577 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		long ABC = A * B * C;

		String abc = ""+ABC;
		
		int[] arr = new int[10];
		for (int i = 0; i < abc.length(); i++) {
			arr[(abc.charAt(i)-'0')]++;
		}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

}
