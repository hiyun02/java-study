package programers;

public class step1_Kdart {
//2018 kakao blind recruitment 1차 다트게임문제. 문자열을 입력받으면 정해진 규칙에 따라 점수를 반환하는 함수
	public static int solution(String dartResult) {

		int score[] = new int[3];
		int idx = -1;

		int length = dartResult.length();
		for (int i = 0; i < length; i++) {

			char c = dartResult.charAt(i);

			if ('0' <= c && c <= '9') {
				score[++idx] = c - '0';
				if (dartResult.charAt(i + 1) == '0') {
					score[idx] = 10;
					i++;
				}

			}

			if (c == 'D')
				score[idx] = (int) Math.pow(score[idx], 2);
			if (c == 'T')
				score[idx] = (int) Math.pow(score[idx], 3);

			if (c == '*') {
				score[idx] *= 2;
				if (idx - 1 > -1)
					score[idx - 1] *= 2;
			}
			if (c == '#')
				score[idx] *= (-1);
		}
		
		return score[0] + score[1] + score[2];
	}
	//예제출력
	public static void main(String[] args) {
		System.out.println(solution("1D#2S*3S"));
	}
}
