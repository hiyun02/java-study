package src.baekjoon;

import java.util.Scanner;

public class q2775 {
    public static int solution(int floor, int room) {
        if (floor == 0) return room;
        if (room == 1) return 1;
        return solution(floor, room - 1) + solution(floor - 1, room);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int f = scn.nextInt();
            int r = scn.nextInt();
            System.out.println(solution(f, r));
        }
    }
}
