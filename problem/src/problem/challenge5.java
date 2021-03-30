package problem;

import java.util.Scanner;

public class challenge5 {

	public static void main(String[] args) {
		
		
//				백준 13305번 : 주유소문제. 각각 도시마다 기름값이 다르고 사이 도로의 길이도 다르다.
//				 1원 당 1km를 달릴 수 있고 가격은 원단위, 길이는 km단위로 주어지며 
//				 기름이 전혀 없는 상태에서 출발한다. 목적지에 도착하기까지 필요한 최저비용은? 
				Scanner s = new Scanner(System.in);
//				도시 수 입력
				int n = s.nextInt();
//				각 도로의 길이를 배열 입력받기
				int[] r = new int[n - 1];

				for (int i = 0; i < n - 1; i++) {
					r[i] = s.nextInt();
				}
//				각 도시의 기름값을 배열로 입력받기
				int[] pri = new int[n];

				for (int i = 0; i < n; i++) {
					pri[i] = s.nextInt();
				}
//				각 도시의 가격들을 순차적으로 확인한다고 할 때
//				현시점의 최저가를 변수 min에 저장. 
//				출발할때의 가격이 pri[0]이므로 이를 저장.
				int min = pri[0];
//				출력값인 최저비용 변수
				long answer=0;
				
//				직접 움직이지 않고 그자리에서 시뮬레이션을 돌린다.
//				다음 도시의 기름값이 현시점 최저가 min보다 비싸다면
//				min을 유지한 채 다음 도시로 갈 비용을 추가시키면 되고,
//				더 저렴하다면 min 값을 갱신시켜 비용을 추가하면 된다.
				for(int i=0;i<n-1;i++) {
					answer+=min*r[i];
//					다음 도시의 가격이 min보다 저렴할 때
					if(min>pri[i+1]) {
						min = pri[i+1];
					}
					
				}
				System.out.println(answer);
			}
		}


