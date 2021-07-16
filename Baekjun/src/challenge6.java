import java.util.Arrays;
import java.util.Scanner;

public class challenge6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);
		if (n == 2) {
			for (int i = 2; i <= arr[1]; i++) {
				if (arr[0] % i == arr[1] % i) {
					System.out.print(i + " ");
				}
			}
		} else {
			int M = g((arr[2] - arr[0]), (arr[1] - arr[0]));

			for (int i = 3; i < n - 1; i++) {
				if (M > g((arr[i] - arr[0]), (arr[i + 1] - arr[0]))) {
					M = g((arr[i] - arr[0]), (arr[i + 1] - arr[0]));
				}
			}

			int i = 2;
			while (i <= M) {
				if (M % i == 0) {
					System.out.print(i + " ");
				}
				i++;
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
