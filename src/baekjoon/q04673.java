package baekjoon;

public class q04673 {

	public static void main(String[] args) {

		boolean[] bool = new boolean[10001];
		for (int i = 1; i < 10001; i++) {
			int n=d(i);
			if (n < 10001) {
				bool[n] = true;
			}
		}

		for (int i =1 ; i < 10001; i++) {
			if (!bool[i]) {
				System.out.println(i);
			}
		}

	}

	public static int d(int n) {

		int sum = n;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}
