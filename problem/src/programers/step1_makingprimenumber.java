package programers;

import java.util.ArrayList;
import java.util.Collections;

public class step1_makingprimenumber {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		System.out.println(solution(numbers));

	}
	public static int solution(int[] nums) {
		int answer=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : nums) {
			for(int j : nums) {
				for(int k : nums) {
					if(i!=j&&j!=k&&k!=i)
					list.add(i+j+k);
				}
			}
		}
		Collections.sort(list);
		for(int i : list) {
			for(int k=2; k<(int)Math.sqrt(i)+1; k++) {
				if(i%k==0) continue;
			}
			answer++;
		}
		return answer;
	}
}
