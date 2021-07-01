package programers;

import java.util.ArrayList;
import java.util.Collections;

public class step1_reversesort {

	//예제 확인을 위한 main함수
	public static void main(String[] args) {

		System.out.println(solution(118372));
	}

	//문제에서 요구하는 정수 내림차순 배치 solution 함수
	public static long solution(long n) {
        long answer = 0;
        ArrayList<Integer> rList = new ArrayList<>();
        
        while(n!=0){
        rList.add((int)(n%10));
            n/=10;
        }
        Collections.reverse(rList);
        
        for(int i=0; i<rList.size();i++){
            answer+=rList.get(i)*Math.pow(10.0,(double)rList.size()-1-i);
        }
        return answer;
    }
}
