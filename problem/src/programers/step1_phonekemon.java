package programers;

import java.util.ArrayList;
import java.util.Scanner;

public class step1_phonekemon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		for(int i=0;i<number.length;i++) {
			number[i] = sc.nextInt();
		}
		System.out.println(solution(number));
		}

    public static int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> species= new ArrayList<>();
        for(int i : nums){
            if(!species.contains(i)){
                species.add(i);
            }
        }
        if(species.size()>=nums.length/2){
            answer=nums.length/2;
        } else{
            answer=species.size();
        }
        return answer;
    }
}

