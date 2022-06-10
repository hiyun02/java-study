package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q02908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		int[] arr = new int[2];
		
		for(int i=0;i<2;i++)
		arr[i] = Integer.parseInt(st.nextToken());

		System.out.println(solution(arr));
	}
	public static int solution(int[] num) {

		for(int i=0;i<2;i++) {
			int n = num[i];
			num[i] = (n/100)+(n%100/10)*10+(n%10)*100;
		}
			
		
		return Math.max(num[0], num[1]);
	}
}
