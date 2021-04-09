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
			//평균을 넘는 학생 수를 세기 위한 변수 smart
			float smart=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>average) {
				smart++;
			}
		}
		//smart에 평균 이상인 학생의 비율 저장
		smart=smart/n*100;
		return smart;
		
	}
		}

