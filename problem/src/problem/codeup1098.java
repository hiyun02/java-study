package problem;

import java.util.Scanner;

public class codeup1098 {

	public static void main(String[] args) {
		int h, w, n, l, d, x, y;
		Scanner s = new Scanner(System.in);
		h = s.nextInt();  // ������ ����
		w = s.nextInt(); // ������ ����
		int[][] arr = new int[h][w];

		n = s.nextInt(); //������ ����
		for (int i = 0; i < n; i++) {
			l = s.nextInt(); // ������ ����
			d = s.nextInt(); // ������ ���� 0�� ����, 1�� ����
			x = s.nextInt()-1; // ������ǥ ��
			y = s.nextInt()-1; // ������ǥ ��
			for (int j = 0; j < l; j++) { // ���⿡ �°�, ������ ���̸�ŭ 1�� �߰�
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
