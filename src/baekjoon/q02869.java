package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q02869 {
//���� 2869 �����̴� �ö󰡰�ʹ�
//���� A��ŭ�ö󰡰� �㿡 B��ŭ �������� �����̰� ���� �� �����̰� V��ŭ �ö󰡴� �� �ɸ��� �ð�(��)�� ���ϴ� ����(���ѽð� 0.15��)
	
	
//	�ð��ʰ��ڵ�. �ܼ��� ���ϰ� Ȯ���ϰ� �ݺ��Ͽ� ���ߴ�.	
//	public static int solution(int A, int B, int V) {
//		int distance = A;
//		int day=1;
//		while(distance<V) {
//			distance-=B;
//			day++;
//			distance+=A;
//		}
//		return day;
//	}

// 0.15�� �̳��� Ǯ���� �ڵ�. ������ ������ ������ A��ŭ �̵��ϰ� �����ϸ� '���������� �°��� �ݺ��Ѵ�'�� ����� �̿�.
// ���ϰ� ���� �۾��� �ݺ��� ���̱� ���� '�־��� �Ÿ� V�� A�� ��'�� '�Ϸ絿���� �̵��� A-B�� ����'
	public static int solution(int A, int B, int V) {
		int distance = V-A;
		if(distance%(A-B)==0) {
			//�������� 0�̸� V-A��ŭ�� �Ÿ��� (V-A)/(A-B)�� ���� ��� �̵���. �����Ÿ��� A�̹Ƿ� ������ ��ħ(+1)�� ����
			return distance/(A-B)+1;
		}
		//0�� �ƴϸ� �� ���� �Ÿ��� (V-A)%(A-B)+A�� �ȴ�.
		//(V-A)%(A-B)�� �׻� A-B���� �����Ƿ� ��Ʋ���� (A-B)+A��ŭ �̵��Ͽ�(+2) ����
		else return distance/(A-B)+2;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] arr = new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		System.out.println(solution(arr[0],arr[1],arr[2]));
	}

}
