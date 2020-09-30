package programmers;
import java.util.*;

/**
 * Date : 2020.09.30
 * Title : 직사각형 별찍기 (https://programmers.co.kr/learn/courses/30/lessons/12969)
 * Difficulty : Level 1
 */
public class PM_level1_직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
