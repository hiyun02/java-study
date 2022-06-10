package programers;

import java.util.Scanner;

public class step1_2016 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(solution(a,b));
	}
	    public static String solution(int a, int b) {
	      String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
			  String answer="";
		        switch(a){
		            case 2:
		            case 8:
		            	answer=day[b%7]; break;
		            case 3: 
		            case 11:
		            	answer=day[(b%7+1)%7]; break;
		            case 5: 
		            	answer=day[(b%7+6)%7]; break;
		            case 6: 
		            	answer=day[(b%7+2)%7]; break;
		            case 9: 
		            case 12:
		            	answer=day[(b%7+3)%7]; break;
		            case 10: 
		            	answer=day[(b%7+5)%7]; break;
		            default:
		            	answer=day[(b%7+4)%7]; break;
		        }
		        return answer;
	    }
}
