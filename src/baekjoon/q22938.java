package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q22938 {

	public static String solution(int[] x, int[] y, int[] r) {
		// x좌표, y좌표, 반지름이 저장된 배열을 매개변수로 받아 함수 시작
		String answer;
		//한점에서 만나는 경우는 겹치지 않는 것으로 간주한다고 했다.
		//따라서 두 원이 겹치려면 서로 두점에서 만나야 한다.
		//따라서 두 원의 반지름 합 > 두 원의 중심사이의 거리(x좌표차이제곱+y좌표차이제곱 의 제곱근)
		double distance = Math.sqrt(Math.pow(x[0]-x[1], 2)+Math.pow(y[0]-y[1], 2));
		//반지름 합이 더 크면 두점에서 만나므로 yes를 대입, 작거나같으면 겹치지 않으므로 no를 대입
		answer=(r[0]+r[1]>distance)?"YES":"NO";
		//함수를 호출한 자리에 answer를 리턴
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x[] = new int[2];
		int y[] = new int[2];
		int r[] = new int[2];
		//입력받은 두 원의 좌표값과 반지름을 앞서 선언한 배열들에 저장
		for(int i=0;i<2;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i]=Integer.parseInt(st.nextToken());
			y[i]=Integer.parseInt(st.nextToken());
			r[i]=Integer.parseInt(st.nextToken());
			st=null;
		}
		br.close();
		bw.write(solution(x,y,r));
		bw.close();
	}

}
