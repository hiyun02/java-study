package problem;

import java.util.Scanner;

public class codeup1098 {

	public static void main(String[] args) {
		int h, w, n, l, d, x, y;
		Scanner s = new Scanner(System.in);
		h = s.nextInt();  // 격자판 세로
		w = s.nextInt(); // 격자판 가로
		int[][] arr = new int[h][w];

		n = s.nextInt(); //막대의 개수
		for (int i = 0; i < n; i++) {
			l = s.nextInt(); // 막대의 길이
			d = s.nextInt(); // 막대의 방향 0은 가로, 1은 세로
			x = s.nextInt()-1; // 세로좌표 값
			y = s.nextInt()-1; // 가로좌표 값
			for (int j = 0; j < l; j++) { // 방향에 맞게, 막대의 길이만큼 1씩 추가
				if (d == 0)
					arr[x][y + j] = 1;
				else
					arr[x + j][y] = 1;
			}

		}
	
	for(int i=0;i<h;i++) {
		for(int j=0;j<w;j++) System.out.print(arr[i][j]+" ");
	System.out.println("");
	s.close();
	 
	}
	
	}

}
