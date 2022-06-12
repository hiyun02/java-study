package baekjoon;

import java.io.*;

public class q11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// �Է¹��� �� ��ü�� ���ڿ��� ����
		String str = br.readLine();
		br.close();
		// �Է¹��� ���ڿ��� ���� , �ѹ��� ȣ���Ͽ� ����ϱ� ���� ���� ����
		int len = str.length();
		// ���ڿ��� ���̰� 10�̸��̸� ��� ��� �� main�Լ� ����
		if (len < 10) {
			bw.write(str);
			bw.close();
			return;
		}
		// substring�� �̿��� 10���ھ��� �߰��� �ٹٲ��ϸ� ���. i�� ������ ����ߴ����� �����ϴ� ������ ���
		int i;
		for (i = 0; i < len-(len%10); i += 10) {
			bw.write(str.substring(i, i + 10));
			bw.write("\n");
		}
		// ���̰� 10�� ����� �ƴϸ�(����� ���ڿ��� ���������Ƿ�) �������� ���
		if (len % 10 != 0)
			bw.write(str.substring(i));

		bw.close();
	}

}
