package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class challenge6 {

	public static void main(String[] args) {
		// 백준 s1 2981번 검문 문제 여러 수의 나머지가 같도록 하는 몫을 모두 찾아라
		// 나의 풀이
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);

		slash : for (int i = 2; i < arr[n - 1]; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] % i != arr[j + 1] % i) {
					continue slash;
				}
			}
			System.out.print(i + " ");
		}

	}
}
