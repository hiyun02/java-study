package problem;

import java.util.Scanner;

public class codeup1099 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] arr = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				arr[i][j] = s.nextInt();

		}

		if (arr[1][1] == 2)
			arr[1][1] = 9;
		else {
			int i = 1, j = 1;
			arr[i][j] = 9;

			move: while (true) {
				switch (arr[i][j + 1]) {
				case 0:
					arr[i][j + 1] = 9;
					j++;
					break;
				case 1:
					if (arr[i + 1][j] == 0) {
						arr[i + 1][j] = 9;
						i++;
					} else if (arr[i + 1][j] == 1)
						break move;
					else if (arr[i + 1][j] == 2) {
						arr[i + 1][j] = 9;
						break move;
					}
					break;
				case 2:
					arr[i][j + 1] = 9;
					break move;
				}
			}
		}
		for (int k = 0; k < 10; k++) {
			for (int l = 0; l < 10; l++)
				System.out.print(arr[k][l] + " ");
			System.out.println("");
		}
	}

}
