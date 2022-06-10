package baekjoon;

import java.util.Scanner;

public class q10996 {

   public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      
      StringBuilder a = new StringBuilder();
      StringBuilder b = new StringBuilder();
      
      for(int i=0;i<n;i++) {
         a.append((i%2==0)?"*":" ");
      }
      for(int i=0;i<n;i++) {
         b.append((i%2==0)?" ":"*");
      }
      
      for(int i=0; i<n*2;i++) {
         System.out.println((i%2==0)?a:b);
      }
   }

}