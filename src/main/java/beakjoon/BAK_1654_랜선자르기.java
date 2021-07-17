package beakjoon;

import java.util.*;

/**
 * Date : 2021.07.17
 * Title : 랜선 자르기 (https://www.acmicpc.net/problem/1654)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[K];
        
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        long high = arr[K-1];
        long low = 1;
        long mid = 0;
        
        while(low <= high) {
            long count = 0;
            
            mid = (low+high)/2;
            
            for (int i = 0; i < arr.length; i++) {
                count += arr[i]/mid;
            }
            
            if (count >= N) {
                low = mid+1;
            }  else {
                high = mid-1;
            }
        }
        
        System.out.println(high);
    }
}