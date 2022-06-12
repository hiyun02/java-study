package src.baekjoon;

import java.io.*;

public class q10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().split(" ");
            System.out.println(solution(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2])));
        }

    }

    //층수와 층 별 방의 수(전층 동일), 손님 번호를 입력받아 최단거리로 배정되는 방의 호수 구하기
    public static int solution(int H, int W, int N) {

        //층수 floor는 N%H와 같음. 0일때는 H층이 됌
        //방번호 rNum은 N/H+1과 같음. N%H가 0이면 N/H가 됌
        int floor = N % H;
        int rNum = N/H+1;
        if (floor == 0) {
            floor = H;
            rNum--;
        }

        //방의 호수는 '층수*100+방번호'의 형식을 따름
        return floor * 100 + rNum;
    }
}
