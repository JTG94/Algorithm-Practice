package beakjoon;
import java.util.*;

/**
 * Date : 2021.07.03
 * Title : 직각삼각형 (https://www.acmicpc.net/problem/4153)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            
            if (arr[0] == 0) {
                break;
            }
            
            if (Math.pow(arr[2],2) == Math.pow(arr[1],2) + Math.pow(arr[0],2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}