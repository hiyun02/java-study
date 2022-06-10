package baekjoon;
import java.util.Scanner;

public class q1093 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[23]; /* 1~23���� arr[0]~arr[22]�� ����, 0���� �ʱ�ȭ */
		for (int i = 0; i < n; i++) {
			int m = s.nextInt();
			arr[m - 1]++; /* m�� �Է¹����� m-1��° �迭���� +1�߰� */
		}
		for (int i = 0; i < 23; i++)
			System.out.print(arr[i]+" ");
	}

}
