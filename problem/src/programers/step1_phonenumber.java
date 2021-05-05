package programers;

public class step1_phonenumber {

	public static void main(String[] args) {
		System.out.println(solution("01049337374"));
	}
	public static String solution(String phone_number) {
		char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	}
}
