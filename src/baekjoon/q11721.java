package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 입력받은 줄 전체를 문자열로 저장
		String str = br.readLine();
		br.close();
		// 입력받은 문자열의 길이 , 한번만 호출하여 사용하기 위해 값을 저장
		int len = str.length();
		// 문자열의 길이가 10미만이면 모두 출력 후 main함수 종료
		if (len < 10) {
			bw.write(str);
			bw.close();
			return;
		}
		// substring을 이용해 10글자씩만 중간에 줄바꿈하며 출력. i는 어디까지 출력했는지를 저장하는 변수로 사용
		int i;
		for (i = 0; i < len-(len%10); i += 10) {
			bw.write(str.substring(i, i + 10));
			bw.write("\n");
		}
		// 길이가 10의 배수가 아니면(출력할 문자열이 남아있으므로) 나머지를 출력
		if (len % 10 != 0)
			bw.write(str.substring(i));

		bw.close();
	}

}
