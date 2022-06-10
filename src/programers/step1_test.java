package programers;

import java.util.ArrayList;

public class step1_test {

   public static void main(String[] args) {
      int[] answers = { 1, 2, 3, 2, 5, 1, 4, 5, 5, 5 };
      System.out.println(solution(answers));
   }

   public static int[] solution(int[] answers) {
      int[] answer = {};
      int one[] = { 1, 2, 3, 4, 5 };
      int two[] = { 2, 1, 2, 3, 2, 4, 2, 5 };
      int three[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
      int score[] = new int[3];
      for (int i = 0; i < answers.length; i++) {
         if (answers[i] == one[i % 5])
            score[0]++;
         if (answers[i] == two[i % 8])
            score[1]++;
         if (answers[i] == three[i % 10])
            score[2]++;
      }
      int max = score[0];
      for (int i : score)
         if (max < i)
            max = i;
      ArrayList<Integer> first = new ArrayList<>();
      for (int i=0;i<score.length;i++)
         if (max == score[i])
            first.add(i+1);
      answer = new int[first.size()];
      for(int i=0; i< first.size();i++)
      answer[i]=first.get(i);
         
      return answer;
   }
}