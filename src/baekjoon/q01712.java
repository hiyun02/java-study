package baekjoon;

import java.util.Scanner;

public class q01712 {

	public static void main(String[] args) {
		// a�� ������� b�� �������. �� �������� a+b, �ǸŰ����� c �Ǹźб����� �� ��° �Ǹ��� �� ���°�?
		Scanner s = new Scanner(System.in);
		long A = s.nextLong();
		long B = s.nextLong();
		long C = s.nextLong();

		if (C<=B) {
			System.out.println(-1);
		} else {
			System.out.println(A/(C-B)+1);
		}
	}

}