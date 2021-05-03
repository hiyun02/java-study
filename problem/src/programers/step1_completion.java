package programers;

public class step1_completion {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
	}
	public static String solution(String[] str1, String[] str2) {
		String answer="";
		return answer;
	}
//	ArrayList를 써서 풀어보려했지만 시간초과가 나옴......
//	public static String solution(String[] str1, String[] str2) {
//		ArrayList<String> part = new ArrayList<>(Arrays.asList(str1));
//		for(String i : str2) {
//			if(part.contains(i)) {
//				part.remove(i);
//			}
//		}
//		String answer="";
//		for(String i : part) {
//			if(i!=null) answer=i;
//		}
//		return answer;
//	}
	
}
