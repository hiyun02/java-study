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
//	ArrayList�� �Ἥ Ǯ��������� �ð��ʰ��� ����......
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
