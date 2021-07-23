package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Date : 2021.07.23
 * Title : 나이순 정렬 (https://www.acmicpc.net/problem/10814)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String[] arr1 = s1.split(" ");
                String[] arr2 = s2.split(" ");
                
                return Integer.parseInt(arr1[0]) - Integer.parseInt(arr2[0]);
            }
        });
        
        for(String result : arr) {
            System.out.println(result);
        }
        
	}
}