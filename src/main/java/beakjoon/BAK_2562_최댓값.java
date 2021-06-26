package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.27
 * Title : 최댓값 (https://www.acmicpc.net/problem/2562)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            if (max < arr[i]) {
                idx = i+1;
                max = arr[i];
            }
        }
        
        System.out.println(max);
        System.out.println(idx);
    }
}