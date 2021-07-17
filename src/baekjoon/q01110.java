package baekjoon;

import java.util.Scanner;

public class q01110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		System.out.println(solution(N));
	}

	public static int solution(int n) {

		int num = n;
		int hap, cycle = 0;

		while (true) {
			// �����ڸ��� �����ڸ��� ���� hap�� ����
			hap = num / 10 + num % 10;
			// num�� �����ڸ��� �����ڸ���, hap�� �����ڸ��� �����ڸ��� �ϴ� �� ź��
			num = (num % 10) * 10 + hap % 10;
			// ����Ŭ 1�߰�
			cycle++;

			// �Ķ���� ���� ������ �ݺ��� Ż��
			if (num == n)
				break;
		}
		// �׶��� ����Ŭ ���� ��ȯ
		return cycle;
	}

}
