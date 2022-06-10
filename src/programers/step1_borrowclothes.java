package programers;

import java.util.ArrayList;

public class step1_borrowclothes {

		public static void main(String[] args) {
	      //입력예시
	      int n = 9;
	      int[] lost = { 1, 3, 5, 7, 9 };
	      int[] reserve = { 2, 4, 5, 6, 8 };
	      
	      System.out.println(solution(n, lost, reserve));
	   }

	   public static int solution(int n, int[] lost, int[] reserve) {
	      int answer = n; //처음엔 체육복이 모두 있는 상태로 시작한다.
	      int[] stu = new int[n];
	      ArrayList<Integer> rental = new ArrayList<>();
	      // 정수 배열의 원소들은 자동으로 0으로 초기화되기에
	      // 체육복 1개인 학생을 0으로 기준잡음
	      // 여벌옷을 가져온 학생에게 ++
	      // 도난당한 학생에겐 --
	      // 그러면 여벌옷을 가져왔으나 도난당한 학생은 0으로 설정된다.
	      // 결과적으로 체육복이 없는(-1) 학생의 번호를 arraylist rental에 저장
	      for (int i : reserve) {
	         stu[i - 1]++;
	      }
	      for (int i : lost) {
	         stu[i - 1]--;
	         if (stu[i - 1] < 0) {
	            rental.add(i - 1);
	            answer--;//도난당해 -1된 학생 수만큼 --
	         }
	      }
	      //체육복이 없는 학생들(rental의 원소들)의 주변을 살핀다.
	      //검사 방향이 왼쪽부터 오른쪽으로 가기 때문에 우선적으로는 앞쪽으로부터 빌린다(양쪽에서 빌리는 경우와 앞쪽만 있는 경우가 해당).
	      //0번째학생 포함 앞쪽에서 빌릴 수 없는 놈들은.
	      //마지막학생이 앞에서 빌릴 수 없다면 else문에서 살필 필요가 없다.
	      //빌리기에 성공하면 ++
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
	      //전체 학생수에서 체육복을 모두 잃은 학생의 수만큼 --, 빌리기에 성공한 수만큼++를 하여 최종 리턴값이 된다.
	      return answer;
	   }
	}

