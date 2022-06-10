package baekjoon;

import java.util.Scanner;

public class q10817 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}
		}

		System.out.println(arr[1]);
	}

}
