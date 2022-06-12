package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class q22938 {

	public static String solution(int[] x, int[] y, int[] r) {
		// x��ǥ, y��ǥ, �������� ����� �迭�� �Ű������� �޾� �Լ� ����
		String answer;
		//�������� ������ ���� ��ġ�� �ʴ� ������ �����Ѵٰ� �ߴ�.
		//���� �� ���� ��ġ���� ���� �������� ������ �Ѵ�.
		//���� �� ���� ������ �� > �� ���� �߽ɻ����� �Ÿ�(x��ǥ��������+y��ǥ�������� �� ������)
		double distance = Math.sqrt(Math.pow(x[0]-x[1], 2)+Math.pow(y[0]-y[1], 2));
		//������ ���� �� ũ�� �������� �����Ƿ� yes�� ����, �۰ų������� ��ġ�� �����Ƿ� no�� ����
		answer=(r[0]+r[1]>distance)?"YES":"NO";
		//�Լ��� ȣ���� �ڸ��� answer�� ����
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x[] = new int[2];
		int y[] = new int[2];
		int r[] = new int[2];
		//�Է¹��� �� ���� ��ǥ���� �������� �ռ� ������ �迭�鿡 ����
		for(int i=0;i<2;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i]=Integer.parseInt(st.nextToken());
			y[i]=Integer.parseInt(st.nextToken());
			r[i]=Integer.parseInt(st.nextToken());
			st=null;
		}
		br.close();
		bw.write(solution(x,y,r));
		bw.close();
	}

}
