package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.30
 * Title : 소수 찾기 (https://www.acmicpc.net/problem/1978)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        first: for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                continue first;
            }
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num%j == 0) {
                    continue first;
                }
            }
            result++;
        }
        
        System.out.println(result);
    }
}