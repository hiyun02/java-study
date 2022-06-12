package baekjoon;

import java.io.*;

public class q10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String star = "*";
		String blank = " ";
		int bs = n;// �� ���� �� �ٱ� ���� ����
		int sb = 0;// �� ���� ���� ����

		for (int i = 0; i < n; i++) {

			bs--;// �ٱ�����. �������ٿ����� bs==0�̹Ƿ� ������� ����
			for (int j = 0; j < bs; j++) {
				bw.write(blank);
			}

			// ���������� ���� (2*n-1)�� ���
			if (i == n - 1)
				for (int j = 0; j < 2 * n - 1; j++)
					bw.write(star);
			// ���� ���ʰ���
			else {
				//��������� 2*sb-1����ŭ ������ ����
				bw.write(star);
				for (int j = 0; j < 2 * sb - 1; j++) {
					bw.write(blank);
				}
				if (sb != 0)//���ʰ����� ����ٸ� ���� �ѹ� �� ����
					bw.write(star);
				sb++;
			}

			bw.write("\n");
		}
		bw.close();
		br.close();
	}

}
