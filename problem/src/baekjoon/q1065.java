package baekjoon;

import java.util.Scanner;

public class q1065 {

	public static void main(String[] args) {
		// ���� 1065 : �Ѽ��� ���� ����
		// 1���� �Է¹��� ������ �Ѽ��� ��� �ִ��� ���� ������ ����Ѵ�.
		// �Ѽ� : �� �ڸ��� ���� ���� ���������� �̷�� ��
		Scanner s = new Scanner(System.in);
		//�Է¹��� ���� ������ ���� N�� �Ѽ��� ������ ������ ���� N�� ����
		int N = s.nextInt();
		int result = 0;
		//1���� �Է¹��� �� N���� �Ѽ����� �ƴ����� Ȯ���ϴ� �ݺ���
		for (int i = 1; i < N + 1; i++) {
			//'�� ���� �Ѽ��̴�'��� ������ �������� ��ȯ�ϴ� solution �Լ��� ���� ��ȯ�ϸ� ����+1�߰�
			if (solution(i))
				result++;

		}
		System.out.println(result);
	}

	static boolean solution(int n) {
		boolean answer;
		
		//100������ ���� ������ �Ѽ��̹Ƿ� ��
		if (n < 100)
			answer = true;
		else {
			//answer�� false�� �ְ� ���ڸ� �ڿ����� �Ѽ����� Ȯ��
			answer = false;
			//a, b, c�� �� ������� ���������̶�� a+c=2*b �� �����Ѵ�.
			if ((n / 100 + n % 100 % 10) / (float) 2 == n % 100 / 10)
				answer = true; //�� �ڸ����� ���������̸� answer�� true�� ����
		}
//if���� Ÿ�� �ʴ´ٸ� false�� ��ȯ�ȴ�.
		return answer;
	}

}
