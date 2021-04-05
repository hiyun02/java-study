package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class challenge6 {

	public static void main(String[] args) {
		// ���� s1 2981�� �˹� ���� ���� ���� �������� ������ �ϴ� ���� ��� ã�ƶ�
		// ���� Ǯ��
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
