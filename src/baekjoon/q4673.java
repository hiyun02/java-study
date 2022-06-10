package baekjoon;
public class q4673 {

	// �����ڰ� �������� �ʴ´ٴ� ������ �������� ������ ���� answer ����
	static boolean answer;

	public static void main(String[] args) {
//�����ڰ� �������� �ʴ�, �̸��� �����ѹ� ���ϱ�
// 1���� 10000���� �˻縦 ���� ������ ���翩�θ� Ȯ��

		for (int i = 1; i < 10000; i++) {
// �����ڰ� �����ϴ� ���� �Ǻ��� �������� ���� ��ȯ�ϴ� �Լ� solution�� �ڸ�
			if (solution(i)) {
				System.out.println(i);
			}
		}
	}

	static boolean solution(int n) {
		answer=true;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						if (n == i * 1001 + j * 101 + k * 11 + l * 2) {
							answer = false;
						}
					}
				}
			}
		}
		return answer;
	}

}

