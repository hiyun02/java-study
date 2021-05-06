package programers;

import java.util.ArrayList;

public class step1_borrowclothes {

		public static void main(String[] args) {
	      //�Է¿���
	      int n = 9;
	      int[] lost = { 1, 3, 5, 7, 9 };
	      int[] reserve = { 2, 4, 5, 6, 8 };
	      
	      System.out.println(solution(n, lost, reserve));
	   }

	   public static int solution(int n, int[] lost, int[] reserve) {
	      int answer = n; //ó���� ü������ ��� �ִ� ���·� �����Ѵ�.
	      int[] stu = new int[n];
	      ArrayList<Integer> rental = new ArrayList<>();
	      // ���� �迭�� ���ҵ��� �ڵ����� 0���� �ʱ�ȭ�Ǳ⿡
	      // ü���� 1���� �л��� 0���� ��������
	      // �������� ������ �л����� ++
	      // �������� �л����� --
	      // �׷��� �������� ���������� �������� �л��� 0���� �����ȴ�.
	      // ��������� ü������ ����(-1) �л��� ��ȣ�� arraylist rental�� ����
	      for (int i : reserve) {
	         stu[i - 1]++;
	      }
	      for (int i : lost) {
	         stu[i - 1]--;
	         if (stu[i - 1] < 0) {
	            rental.add(i - 1);
	            answer--;//�������� -1�� �л� ����ŭ --
	         }
	      }
	      //ü������ ���� �л���(rental�� ���ҵ�)�� �ֺ��� ���ɴ�.
	      //�˻� ������ ���ʺ��� ���������� ���� ������ �켱�����δ� �������κ��� ������(���ʿ��� ������ ���� ���ʸ� �ִ� ��찡 �ش�).
	      //0��°�л� ���� ���ʿ��� ���� �� ���� �����.
	      //�������л��� �տ��� ���� �� ���ٸ� else������ ���� �ʿ䰡 ����.
	      //�����⿡ �����ϸ� ++
	      for (int i : rental) {
	         if (i > 0 && stu[i - 1] > 0) {
	            stu[i - 1] = 0;
	            answer++;
	         } else if (i < n-1 && stu[i + 1] > 0) {
	            if (stu[i + 1] > 0) {
	               stu[i + 1] = 0;
	               answer++;
	            }
	         }
	      }
	      //��ü �л������� ü������ ��� ���� �л��� ����ŭ --, �����⿡ ������ ����ŭ++�� �Ͽ� ���� ���ϰ��� �ȴ�.
	      return answer;
	   }
	}

