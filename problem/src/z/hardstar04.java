package z;

import java.util.Scanner;

public class hardstar04 {

	public static void main(String[] args) {
		// 줄마다 별과 공백의 개수를 지정하고 출력할 때마다 각각의 개수를 줄여나간다.
		// 할당된 공백을 모두 찍으면 별을 찍기 시작하고 별까지 모두 찍으면 개행을 한다.
	Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int rowstar = 1, rowblank = n-1;
		int blank = rowblank;
		int star = rowstar;

		for (int i = 0; i < (n-1)*(3*n-2)+(2*n-1); i++) {
			if (blank > 0) {
				System.out.print(" ");
				blank--;
			} else {
				System.out.print("*");
				star--;
			}
			if (star == 0) {
				System.out.println();
				if (i < ((n-1)*(3*n-2)+(2*n-1))/2) {
					rowstar += 2;
					rowblank--;
					blank = rowblank;
					star = rowstar;
				} else {
					rowstar -= 2;
					rowblank++;
					blank = rowblank;
					star = rowstar;
				}
			}
		}
	}

}
