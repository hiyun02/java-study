package baekjoon;

import java.util.Scanner;

public class q4344_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//i�� �׽�Ʈ���̽� ��ȣ
		for (int i = 0; i < n; i++) {
			//�׽�Ʈ ���̽� i���� �л� ��
			int student = s.nextInt();
			//�л����� ������ �����ϱ� ���� �迭 ����
			int[] score = new int[student];
			//������ �л����� ����ŭ �Է¹ޱ�
			for (int j = 0; j < score.length; j++) {
				score[j] = s.nextInt();
			}
			//��� ���ϱ� : sum�� �л��� ������ ������ ���� �л� ���� ����
			int sum=0;
			for (int j = 0; j < score.length; j++) {
				sum+=score[j];
			}
			float average= sum/(float)student;
			
			//��������� �Ѵ� �л��� ���� ������ ���� smart���� �� ����
			int smart=0;
		for (int j = 0; j < score.length; j++) {
			if(score[j]>average) {
				smart++;
			}
		}
		//����� �Ѵ� �л� ���� ������ ���ϱ�
		System.out.printf("%.3f", smart/(float)student*100);
		System.out.println("%");
		}
	}

}
