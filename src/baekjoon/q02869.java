package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q02869 {
//백준 2869 달팽이는 올라가고싶다
//낮에 A만큼올라가고 밤에 B만큼 내려가는 달팽이가 있을 때 달팽이가 V만큼 올라가는 데 걸리는 시간(일)을 구하는 문제(제한시간 0.15초)
	
	
//	시간초과코드. 단순히 더하고 확인하고를 반복하여 구했다.	
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

// 0.15초 이내로 풀이한 코드. 마지막 날에는 무조건 A만큼 이동하고 종료하며 '그전까지는 승강을 반복한다'는 사실을 이용.
// 더하고 빼는 작업의 반복을 줄이기 위해 '주어진 거리 V와 A의 차'를 '하루동안의 이동량 A-B로 나눔'
	public static int solution(int A, int B, int V) {
		int distance = V-A;
		if(distance%(A-B)==0) {
			//나머지가 0이면 V-A만큼의 거리는 (V-A)/(A-B)일 동안 모두 이동함. 남은거리는 A이므로 다음날 아침(+1)에 도착
			return distance/(A-B)+1;
		}
		//0이 아니면 총 남은 거리는 (V-A)%(A-B)+A가 된다.
		//(V-A)%(A-B)는 항상 A-B보다 작으므로 이틀동안 (A-B)+A만큼 이동하여(+2) 도착
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
