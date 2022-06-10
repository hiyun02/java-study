package baekjoon;

import java.util.Scanner;

public class q4344_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//i는 테스트케이스 번호
		for (int i = 0; i < n; i++) {
			//테스트 케이스 i번의 학생 수
			int student = s.nextInt();
			//학생들의 점수를 저장하기 위한 배열 선언
			int[] score = new int[student];
			//점수를 학생들의 수만큼 입력받기
			for (int j = 0; j < score.length; j++) {
				score[j] = s.nextInt();
			}
			//평균 구하기 : sum에 학생들 점수의 총합을 구해 학생 수로 나눔
			int sum=0;
			for (int j = 0; j < score.length; j++) {
				sum+=score[j];
			}
			float average= sum/(float)student;
			
			//평균점수를 넘는 학생의 수를 저장할 변수 smart선언 후 세기
			int smart=0;
		for (int j = 0; j < score.length; j++) {
			if(score[j]>average) {
				smart++;
			}
		}
		//평균을 넘는 학생 수의 비율을 구하기
		System.out.printf("%.3f", smart/(float)student*100);
		System.out.println("%");
		}
	}

}
