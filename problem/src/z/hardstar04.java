package z;

import java.util.Scanner;

public class hardstar04 {

	public static void main(String[] args) {
		// �ٸ��� ���� ������ ������ �����ϰ� ����� ������ ������ ������ �ٿ�������.
		// �Ҵ�� ������ ��� ������ ���� ��� �����ϰ� ������ ��� ������ ������ �Ѵ�.
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
