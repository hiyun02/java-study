package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class challenge6 {

	public static void main(String[] args) {
		//���� s1 2981�� �˹� ���� ���� ���� �������� ������ �ϴ� ���� ��� ã�ƶ�
		// ���� Ǯ��
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int[] nam = new int[0];
		
		Arrays.sort(arr);
		
	
		
		
		slash: for (int i = 2; i < arr[n - 1] - 1; i++) {

			for (int j = 0; j < arr.length; j++) {
				nam[j] = arr[j] % i;
			}
			for (int j = 0; j < nam.length - 1; j++) {
				if (nam[j] != nam[j + 1]) {
					continue slash;
				}

			}
			System.out.println(i + " ");
		 
		}
		
	}

}
