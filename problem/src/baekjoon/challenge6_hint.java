package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class challenge6_hint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);
		if (n == 2) {
			for (int M = 2; M <= arr[1]; M++) {
				if ((arr[1]-arr[0])%M==0) {
					System.out.print(M + " ");
				}
			}
		} else {
			int S = g((arr[2] - arr[0]), (arr[1] - arr[0]));

			for (int i = 3; i < n ; i++) {
			 
					S = g((arr[i] - arr[0]), S);
			}

			int M = 2;
			while (M <= S) {
				if (S % M == 0) {
					System.out.print(M + " ");
				}
				M++;
			}
		}
	}

	public static int g(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return g(y, x % y);
		}
	}
}