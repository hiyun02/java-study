package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class q01316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//ù�ٿ� �Էµ� �ܾ��� ������ ����
		int n = Integer.parseInt(bf.readLine());
		
		//�ܾ��� ������ŭ ���ڿ��迭�� �����ϰ� �ݺ����� ���� �ܾ �Է¹���
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = bf.readLine();
		}
		bf.close();
		//�ܾ���� ��� �迭�� �Ű������� �Ͽ� �׷�ܾ��� ������ �����ִ� solution�Լ��� ȣ��
		System.out.println(solution(arr));
	}

	public static int solution(String[] arr) {
		//�׷�ܾ��� ���� ������ ����. ��� ���ڿ��� �׷�ܾ��� �����ϰ� ����
		int answer=arr.length;
		
		//�� ���ڸ����� ���� ���θ� ������ hashmap
		
		//arr�� ���ҵ��� �׷�ܾ����� Ȯ���ϴ� �ݺ���
		for(String i : arr) {
			
			int n = i.length();
			//�� �ڸ������� ���ڿ� ������ �׷� ���θ� �����ϱ����� ��ü ����
			HashMap<Character, Boolean> map = new HashMap<>();
			
			//ù���ڴ� ������ �׷��̵Ǵ� �����̹Ƿ� value�� true���� �Բ� ����
			map.put(i.charAt(0), true);
			
			//���ڸ����� ���ڵ��� �׷����� �����ϴ��� �Ǵ��ϴ� �ݺ���
			for(int k=1;k<n;k++) {
				//charAt()�� �ݺ� ȣ���� ���̱� ���� ���� ����
				char ch= i.charAt(k);
				
				//�չ��ڿ� ���繮�ڰ� �ٸ� �� �����ϴ� ���ǹ�
				if(ch!=i.charAt(k-1)) {
				//1. ������ key�� ����� �� ���� ������ �� key : ch , value : true�� ����. 
				//2. �̹� key�� �����ϴ� ������ ��(�׷��� ������) value : false�� ����
					map.put(ch, !map.getOrDefault(ch, false) );
					
					//map�� value�� ���ڸ����� �׷쿩����. �ϳ��� false�̸�(2���� ���) �ݺ��� ����
					if(!map.get(ch)) {
						//�� ���ڶ� �׷��� �ƴϸ� �� ���ڰ� ���� ���ڿ��� �׷�ܾ �� �� ����
						answer--;
						//�׷�ܾ��� �� answer�� 1��ŭ ���̰� break. ���� ���ڿ��� �Ѿ.
						break;
					}
				}
				
			}
		}
		
		return answer;
	}
}
