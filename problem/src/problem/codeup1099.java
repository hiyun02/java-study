package problem;

import java.util.Scanner;

public class codeup1099 {

	public static void main(String[] args) {
		//1과 0, 2로 이루어진 개미집이 있다. 개미는 오른쪽으로 이동하다가 1을 만나면 아래로 움직이며,
		//성실하게 움직이기 때문에 최단거리로만 움직이려 다른 방향으로는 가지 않는다. 개미는 먹이를 찾거나 갈 곳이 없으면 멈춘다.
		//개미집의 구조를 10*10의 형태로 입력받으면 (1,1)의 위치에서 출발하는 개미의 이동경로를 9로 표현한다.
		Scanner s = new Scanner(System.in);
		//개미집의 구조 입력받기
		int[][] arr = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				arr[i][j] = s.nextInt();

		}
		//출발위치에 먹이가 있을 경우
		if (arr[1][1] == 2)
			arr[1][1] = 9; 
		//출발위치에 먹이가 없을 경우
		else {
			int i = 1, j = 1;
			arr[i][j] = 9;

			move: while (true) {
				switch (arr[i][j + 1]) {
				case 0: //우측이 0이면 우측으로 1칸 이동
					arr[i][j + 1] = 9;
					j++;
					break;
				case 1: //우측이 1이면 하단으로 1칸 이동
					if (arr[i + 1][j] == 0) {
						arr[i + 1][j] = 9;
						i++;
					} //하단도 1이면 갈 곳이 없으므로 멈춤
					else if (arr[i + 1][j] == 1)
						break move; //반복문 탈출
					//하단이 2라면 하단으로 1칸 이동하여 멈춤
					else if (arr[i + 1][j] == 2) {
						arr[i + 1][j] = 9;
						break move; //반복문 탈출
					}
					break;
				case 2://우측이 2이면 우측으로 1칸 이동하여 멈춤
					arr[i][j + 1] = 9;
					break move;//반복문 탈출
				}
			}
		}
		//개미의 이동경로를 포함한 개미집 구조 출력
		for (int k = 0; k < 10; k++) {
			for (int l = 0; l < 10; l++)
				System.out.print(arr[k][l] + " ");
			System.out.println("");
		}
	}

}
