package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.28
 * Title : 검증수 (https://www.acmicpc.net/problem/2475)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            int input_num = sc.nextInt();
            sum += input_num * input_num;
        }
        
        System.out.println(sum%10);
    }
}