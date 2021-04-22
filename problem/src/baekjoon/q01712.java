package baekjoon;

import java.util.Scanner;

public class q01712 {

	public static void main(String[] args) {
		// a�� ������� b�� �������. �� �������� a+b, �ǸŰ����� c �Ǹźб����� �� ��° �Ǹ��� �� ���°�?
		Scanner s = new Scanner(System.in);
		long A = s.nextLong();
		long B = s.nextLong();
		long C = s.nextLong();

		if (A + B >= C && B >= C) {
			System.out.println(-1);
		} else {
			long i = 0; //�ǸŰ���
			while (B * i + A >= C * i) {
				i++;
			}
			System.out.println(i);
		}
	}

}
