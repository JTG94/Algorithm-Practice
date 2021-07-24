package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Date : 2021.07.24
 * Title : 수 정렬하기 3 (https://www.acmicpc.net/problem/10989)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[10001];
        
        
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        
        for (int i = 0; i < 10001; i++) {
            if (arr[i] >= 1) {
                while(arr[i] != 0) {
                    sb.append(i).append('\n');
                    arr[i]--;
                }
            }
        }
        
        System.out.println(sb);
	}
}