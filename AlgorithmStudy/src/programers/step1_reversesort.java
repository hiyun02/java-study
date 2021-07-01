package programers;

import java.util.ArrayList;
import java.util.Collections;

public class step1_reversesort {

	//���� Ȯ���� ���� main�Լ�
	public static void main(String[] args) {

		System.out.println(solution(118372));
	}

	//�������� �䱸�ϴ� ���� �������� ��ġ solution �Լ�
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
