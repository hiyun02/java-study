package programers;

import java.util.ArrayList;
import java.util.Collections;

public class step1_makingprimenumber {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7 };
		System.out.println(solution(arr));
	}

	public static int solution(int[] nums) {
		int answer = 0;

		ArrayList<Integer> list = new ArrayList<>();

		if (nums.length == 3) {
			list.add(nums[0] + nums[1] + nums[2]);
		} else {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					for (int k = j + 1; k < nums.length; k++) {
						if ((nums[i] + nums[j] + nums[k]) % 2 != 0)
							list.add(nums[i] + nums[j] + nums[k]);

					}
				}
			}
		}

		for (int i : list) {
			answer++;
			for (int m = 2; m < (int) Math.sqrt(i) + 1; m++) {
				if (i % m == 0) {
					answer--;
					break;
				}
			}
		}

		return answer;
	}

}
