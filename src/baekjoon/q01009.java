package baekjoon;

import java.io.*;

public class q01009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split(" ");
			int a =Integer.parseInt(in[0]);
			int b =Integer.parseInt(in[1]);
			
			int answer=1;
			for(int j=0;j<b;j++) {
				answer*=a;
				if(answer>9) answer%=10;
				
			}
			bw.write(Integer.toString((answer==0)?0:answer));
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}
