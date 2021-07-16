package problem;

import java.util.Scanner;

public class codeup1099 {

	public static void main(String[] args) {
		//1�� 0, 2�� �̷���� �������� �ִ�. ���̴� ���������� �̵��ϴٰ� 1�� ������ �Ʒ��� �����̸�,
		//�����ϰ� �����̱� ������ �ִܰŸ��θ� �����̷� �ٸ� �������δ� ���� �ʴ´�. ���̴� ���̸� ã�ų� �� ���� ������ �����.
		//�������� ������ 10*10�� ���·� �Է¹����� (1,1)�� ��ġ���� ����ϴ� ������ �̵���θ� 9�� ǥ���Ѵ�.
		Scanner s = new Scanner(System.in);
		//�������� ���� �Է¹ޱ�
		int[][] arr = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				arr[i][j] = s.nextInt();

		}
		//�����ġ�� ���̰� ���� ���
		if (arr[1][1] == 2)
			arr[1][1] = 9; 
		//�����ġ�� ���̰� ���� ���
		else {
			int i = 1, j = 1;
			arr[i][j] = 9;

			move: while (true) {
				switch (arr[i][j + 1]) {
				case 0: //������ 0�̸� �������� 1ĭ �̵�
					arr[i][j + 1] = 9;
					j++;
					break;
				case 1: //������ 1�̸� �ϴ����� 1ĭ �̵�
					if (arr[i + 1][j] == 0) {
						arr[i + 1][j] = 9;
						i++;
					} //�ϴܵ� 1�̸� �� ���� �����Ƿ� ����
					else if (arr[i + 1][j] == 1)
						break move; //�ݺ��� Ż��
					//�ϴ��� 2��� �ϴ����� 1ĭ �̵��Ͽ� ����
					else if (arr[i + 1][j] == 2) {
						arr[i + 1][j] = 9;
						break move; //�ݺ��� Ż��
					}
					break;
				case 2://������ 2�̸� �������� 1ĭ �̵��Ͽ� ����
					arr[i][j + 1] = 9;
					break move;//�ݺ��� Ż��
				}
			}
		}
		//������ �̵���θ� ������ ������ ���� ���
		for (int k = 0; k < 10; k++) {
			for (int l = 0; l < 10; l++)
				System.out.print(arr[k][l] + " ");
			System.out.println("");
		}
	}

}
