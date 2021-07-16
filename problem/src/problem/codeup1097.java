package problem;

import java.util.Scanner;

public class codeup1097 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] bw = new int[19][19];

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				bw[i][j] = s.nextInt(); // 바둑판에 값 입력받기
			}
		}
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int x = s.nextInt()-1; //십자뒤집기의 기준이 될 좌표 입력 : 0,0 을 1,1로 보기때문에 -1
			int y = s.nextInt()-1;

			for (int j = 0; j < 19; j++) {
				if (bw[j][y] == 0)
					bw[j][y] = 1;
				else
					bw[j][y] = 0; // 가로줄 뒤집기
				
				if (bw[x][j] == 0)
					bw[x][j] = 1;
				else
					bw[x][j] = 0;// 세로줄 뒤집기
			}
		}

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++)
				System.out.print(bw[i][j] + " ");
			System.out.println("");// 결과 출력
		}
	}

}
