package baekjoon;
import java.util.Scanner;

public class challenge5 {

	public static void main(String[] args) {
//		���� 13305�� : �����ҹ���. ���� ���ø��� �⸧���� �ٸ��� ���� ������ ���̵� �ٸ���.
//		 1�� �� 1km�� �޸� �� �ְ� ������ ������, ���̴� km������ �־����� 
//		 �⸧�� ���� ���� ���¿��� ����Ѵ�. �������� �����ϱ���� �ʿ��� ���������? 
		Scanner s = new Scanner(System.in);
//		���� �� �Է�
		int n = s.nextInt();
//		�� ������ ���̸� �迭 �Է¹ޱ�
		int[] r = new int[n - 1];

		for (int i = 0; i < n - 1; i++) {
			r[i] = s.nextInt();
		}
//		�� ������ �⸧���� �迭�� �Է¹ޱ�
		int[] pri = new int[n];

		for (int i = 0; i < n; i++) {
			pri[i] = s.nextInt();
		}
//		�� ������ ���ݵ��� ���������� Ȯ���Ѵٰ� �� ��
//		�������� �������� ���� min�� ����. 
//		����Ҷ��� ������ pri[0]�̹Ƿ� �̸� ����.
		int min = pri[0];
//		��°��� ������� ����
		long answer=0;
		
//		���� �������� �ʰ� ���ڸ����� �ùķ��̼��� ������.
//		���� ������ �⸧���� ������ ������ min���� ��δٸ�
//		min�� ������ ä ���� ���÷� �� ����� �߰���Ű�� �ǰ�,
//		�� �����ϴٸ� min ���� ���Ž��� ����� �߰��ϸ� �ȴ�.
		for(int i=0;i<n-1;i++) {
//			min���� ���������� ������ ��� ��
			if(min<=pri[i+1]) {
				answer+=min*r[i];
			}
//			���� ������ ������ min���� ������ ��
			else {
				answer += min*r[i];
				min = pri[i+1];
				
			}
		}
		System.out.println(answer);
	}
}
