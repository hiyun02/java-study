import java.util.Scanner;

public class challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
System.out.println(solution(s));
	}
	
	   public static boolean solution(String s) {
	        boolean answer = true;
			  int r1=0;
			  int r2=0;
	for(int i = 0 ; i< s.length();i++) {
		if(s.charAt(i)=='P'||s.charAt(i)=='p') r1++;
		else if(s.charAt(i)=='Y'||s.charAt(i)=='y') r2++;
		else continue;
	}		 

	answer = (r1==r2);

	        return answer;
	    }
	

}

