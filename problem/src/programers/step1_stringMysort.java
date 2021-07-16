package programers;

public class step1_stringMysort {
	public String[] solution(String[] strings, int n) {
		
		String temp;
		for (int i = 0; i < strings.length; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].charAt(n) > strings[j].charAt(n)
						|| (strings[i].charAt(n) == strings[j].charAt(n) && strings[i].compareTo(strings[j]) > 0)) {
					temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}

			}

		}

		return strings;
	}
}
