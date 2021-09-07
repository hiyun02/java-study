package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q02869 {

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
	
	public static int solution(int A, int B, int V) {
		int distance = V-A;
		if(distance%(A-B)!=0) {
			return distance/(A-B)+1;
		}
		else return distance/(A-B);
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
