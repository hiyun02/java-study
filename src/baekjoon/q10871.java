package baekjoon;
import java.util.Scanner;

public class q10871 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int X = s.nextInt();

		for (int i = 0; i < N; i++) {
			int n = s.nextInt();
			if (n < X) {
				System.out.print(n + " ");
			}
		}
	}

}
