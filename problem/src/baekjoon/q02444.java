package baekjoon;

import java.util.Scanner;

public class q02444 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int k = n;// 공백 출력 횟수
		for (int i = 0; i < n * 2 - 1; i++) {
			if (i < n)
				k--;
			else
				k++;
			for (int j = 0; j < k + (n-k) * 2 - 1; j++) {
				if (j < k)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
