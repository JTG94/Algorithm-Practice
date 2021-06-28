package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.28
 * Title : 나머지 (https://www.acmicpc.net/problem/3052)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int input_num = sc.nextInt();
            set.add(input_num%42);
        }
        
        System.out.println(set.size());
    }
}