package programers;

public class step1_StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String s) {
        int answer = 0;
        if(s.charAt(0)=='-'){
            String str=s.substring(1, s.length());
            answer=Integer.parseInt(str);
        }
        else{
            answer=Integer.parseInt(s);
        }
        return answer;
    }
}
