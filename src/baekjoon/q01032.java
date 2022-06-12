package baekjoon;

import java.io.*;

public class q01032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		bw.write(solution(arr));
		bw.close();
		br.close();

	}

	public static String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();

		// �ݺ��� ���� �� �Ǵ��� ������ �������� ������ ���� ���� ����
		boolean b1;
		boolean b2;

		// �迭 �� ��� ���ڿ��� ����, ������ ������ ���̴� ������
		int n = arr[0].length();

		// n����ŭ, n���� ���ڵ��� ������� �˻��ϴ� �ݺ���
		for (int i = 0; i < n; i++) {

			b1 = true;
			b2 = true;

			// �� ���ڿ����� ���� �ڸ� ���ڰ� ������ �� �˻��ϴ� �ݺ���. �ϳ��� ��ġ���� ������ b1�� false�� ����
			char ch = arr[0].charAt(i);
			for (String k : arr) {
				if (k.charAt(i) != ch)
					b1 = false;
			}

			// ���� �ڸ� ���ڳ��� ��� ������ �� �ش� ���ڸ� append
			if (b1) {
					sb.append(ch);
			}
			// ���� �ڸ� ���ڳ��� �������� ������ "?"�� append
			else {
				sb.append("?");
			}
		}
		// n�� append�� ��ģ �� ����
		return sb.toString();
	}
}
