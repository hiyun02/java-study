package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class step1_BestAndWorseOfLotto {

	public static void main(String[] args) {
		int[] lot = { 45, 1, 3, 2, 31, 19 };
		int[] win = { 31, 10, 45, 1, 6, 19 };
		System.out.println(Arrays.toString(solution(lot, win)));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
	        ArrayList<Integer> llist =  new ArrayList<>();
	        ArrayList<Integer> wlist =  new ArrayList<>();
	      
	        int answer[] = new int[2];
	        int rnk=7;
	       
	        for(int i: lottos) {
	        	llist.add(i);
	        }
	        for(int i: win_nums) {
	        	wlist.add(i);
	        }
	        
	        
	        Collections.sort(llist);
	        Collections.sort(wlist);

	        //훼손된 번호(0)가 없을 때
	        if(!llist.contains(0)) {
	    	   
	    	   for(int i=0;i<6;i++) {
	    		   if(wlist.contains(llist.get(i))) {
	    			   rnk--;
	    		   }
	    	   }
	    	   if(rnk==7) rnk=6;
	    	   answer[0]=answer[1]=rnk;
	    	   
	       }
	       
	       //훼손된 번호 0이 존재할 때
	       else {
	    	   int zero=0;
	    	   int size = llist.size();
	    	   for(int i=0; i<size;i++) {
	    		   if(llist.get(i)==0) {
	    			   llist.remove(i);
	    			   i--; size--;
	    			   zero++;
	    		   } else {
	    		     if(wlist.contains(llist.get(i))) {
	    			   wlist.remove(i);
	    			   i--; size--;
	    			   rnk--;
	    		      }
	    		     }
	    	   
	    	   }
	    	   
	    	   
	    	   answer[0]=rnk-zero;
	    	   
	    	   if(rnk==7) rnk=6;
	    	   answer[1]=rnk;
	    	   
	       }
	       
	        
	        return answer;
	    }
	public static int[] Solution(int[] lotto, int[]win_nums) {
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		int zero=0;
		int rank=0;
		
		return null;
	}
}
