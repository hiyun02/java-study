package baekjoon;

import java.util.Scanner;

public class q4344_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int student = s.nextInt();
			int[] score = new int[student];
			for (int j = 0; j < score.length; j++) {
				score[j] = s.nextInt();
			}
			
			System.out.printf("%.3f", function(student, score));
			System.out.println("%");
		}
	}
	public static float function(int n, int arr[]) {
			
		int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum+=arr[i];
			}
			float average= sum/(float)n;
			//����� �Ѵ� �л� ���� ���� ���� ���� smart
			float smart=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>average) {
				smart++;
			}
		}
		//smart�� ��� �̻��� �л��� ���� ����
		smart=smart/n*100;
		return smart;
		
	}
		}

