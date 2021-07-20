package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class q01316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//첫줄에 입력될 단어의 개수를 저장
		int n = Integer.parseInt(bf.readLine());
		
		//단어의 개수만큼 문자열배열을 선언하고 반복문을 통해 단어를 입력받음
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = bf.readLine();
		}
		bf.close();
		//단어들이 담긴 배열을 매개변수로 하여 그룹단어의 개수를 세어주는 solution함수를 호출
		System.out.println(solution(arr));
	}

	public static int solution(String[] arr) {
		//그룹단어의 수를 저장할 변수. 모든 문자열이 그룹단어라고 가정하고 시작
		int answer=arr.length;
		
		//각 문자마다의 연속 여부를 저장할 hashmap
		
		//arr의 원소들이 그룹단어인지 확인하는 반복문
		for(String i : arr) {
			
			int n = i.length();
			//각 자리마다의 문자와 문자의 그룹 여부를 저장하기위한 객체 선언
			HashMap<Character, Boolean> map = new HashMap<>();
			
			//첫글자는 무조건 그룹이되는 문자이므로 value에 true값과 함께 저장
			map.put(i.charAt(0), true);
			
			//각자리마다 문자들이 그룹으로 존재하는지 판단하는 반복문
			for(int k=1;k<n;k++) {
				//charAt()을 반복 호출을 줄이기 위한 변수 선언
				char ch= i.charAt(k);
				
				//앞문자와 현재문자가 다를 때 실행하는 조건문
				if(ch!=i.charAt(k-1)) {
				//1. 기존에 key로 저장된 적 없는 문자일 때 key : ch , value : true로 저장. 
				//2. 이미 key로 존재하는 문자일 때(그룹이 깨질때) value : false로 저장
					map.put(ch, !map.getOrDefault(ch, false) );
					
					//map의 value는 문자마다의 그룹여부임. 하나라도 false이면(2번일 경우) 반복문 진입
					if(!map.get(ch)) {
						//한 문자라도 그룹이 아니면 그 문자가 속한 문자열은 그룹단어가 될 수 없음
						answer--;
						//그룹단어의 수 answer를 1만큼 줄이고 break. 다음 문자열로 넘어감.
						break;
					}
				}
				
			}
		}
		
		return answer;
	}
}
