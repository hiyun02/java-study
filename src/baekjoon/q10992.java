package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String star = "*";
		String blank = " ";
		int bs = n;// 각 줄의 별 바깥 공백 개수
		int sb = 0;// 별 안쪽 공백 개수

		for (int i = 0; i < n; i++) {

			bs--;// 바깥공백. 마지막줄에서는 bs==0이므로 출력하지 않음
			for (int j = 0; j < bs; j++) {
				bw.write(blank);
			}

			// 마지막줄은 별만 (2*n-1)번 출력
			if (i == n - 1)
				for (int j = 0; j < 2 * n - 1; j++)
					bw.write(star);
			// 별과 안쪽공백
			else {
				//별먼저찍고 2*sb-1번만큼 공백을 찍음
				bw.write(star);
				for (int j = 0; j < 2 * sb - 1; j++) {
					bw.write(blank);
				}
				if (sb != 0)//안쪽공백을 찍었다면 별을 한번 더 찍음
					bw.write(star);
				sb++;
			}

			bw.write("\n");
		}
		bw.close();
		br.close();
	}

}
