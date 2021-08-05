package programers;

public class step1_weeklychallenge1 {

	//놀이기구의 원래 이용료는 price인데 n번째 이용할 때마다 n배의 이용료를 받는다. 
	//가진금액이 money라면, 얼마가 모자란 지 리턴하는 함수. 모자르지 않으면 0을 리턴한다.
	public static long solution(long price, long money, long count) {
		//등차수열의 합공식과 max()를 이용
		return Math.max(price*(count*(1+count)/2)-money,0);
	}

	//예제출력
	public static void main(String[] args) {
		System.out.println(solution(3,20,4));
	}
}
