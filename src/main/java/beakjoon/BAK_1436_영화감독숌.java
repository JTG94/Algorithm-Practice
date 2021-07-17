package beakjoon;

import java.util.*;

/**
 * Date : 2021.07.17
 * Title : 영화감독 숌 (https://www.acmicpc.net/problem/1436)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        int result = 0;
        
        while(N > 0) {
            result++;
            if (Integer.toString(result).contains("666")) {
                N--;
            }
        }
        
        System.out.println(result);
    }
}