package programers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class step1_SelectandSum {

	
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,1};
		System.out.println(Arrays.toString(solution(arr)));
	}

    public static int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = numbers.length;
        
        for(int i=0; i<n; i++){
            for(int k=i+1; k<n; k++){
                
                int sum = numbers[i]+numbers[k];
                
                if(!list.contains(sum))
                list.add(sum);
           
            }
        }
        
        Collections.sort(list);
        int size = list.size();
        
        int[] answer= new int[size];
        for(int i=0; i<size; i++){
            answer[i]=list.get(i);
        }
        
        return answer;
        
    }
}