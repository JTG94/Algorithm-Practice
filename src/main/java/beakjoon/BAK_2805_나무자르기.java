package beakjoon;

import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

/**
 * Date : 2021.07.23
 * Title : 나무 자르기 (https://www.acmicpc.net/problem/2805)
 */
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] trees = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(trees);

        long start = 0;
        long end = trees[n-1];
        
        while(start <= end) {
            long mid = (start+end) / 2;
            long sum = 0;
            for (int tree : trees) {
                if (tree > mid) sum += tree - mid;
            }
            
            if (sum >= m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        System.out.println(end);
    }
}