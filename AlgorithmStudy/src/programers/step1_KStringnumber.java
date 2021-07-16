package programers;

public class step1_KStringnumber {

	public static void main(String[] args) {
		
		System.out.println(solution("one2three4five6seven8nine"));
		
	}

	public static int solution(String s) {
		String nums[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < 10; i++) {
			s = s.replaceAll(nums[i], Integer.toString(i));
		}

		int answer = 0;
		int length = s.length();

		for (int i = 0; i < length; i++) {

			answer += (s.charAt(i) - '0') * Math.pow(10, length - 1 - i);

		}

		return answer;
	}

}
