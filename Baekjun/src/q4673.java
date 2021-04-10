public class q4673 {

	// 생성자가 존재하지 않는다는 명제의 참거짓을 저장할 논리형 answer 선언
	static boolean answer;

	public static void main(String[] args) {
//생성자가 존재하지 않는, 이른바 셀프넘버 구하기
// 1부터 10000까지 검사를 통해 생성자 존재여부를 확인

		for (int i = 1; i < 10000; i++) {
// 생성자가 존재하는 지를 판별해 논리형으로 값을 반환하는 함수 solution의 자리
			if (solution(i)) {
				System.out.println(i);
			}
		}
	}

	static boolean solution(int n) {
		answer=true;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						if (n == i * 1001 + j * 101 + k * 11 + l * 2) {
							answer = false;
						}
					}
				}
			}
		}
		return answer;
	}

}

