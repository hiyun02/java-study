package programers;

import java.util.Scanner;

public class step1_sumdivisor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		System.out.println(solution(N));
	}

	public static int solution(int n) {
		 int answer = 0;
	       int root=(int)Math.sqrt(n);
	        for(int i=1;i<root+1;i++){
	            if(n%i==0){
	                answer+=i;
	                if(n/i!=i)
	                answer+=n/i;
	            }
	        }
	        return answer;
	}

}