package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Date : 2021.07.24
 * Title : 블랙잭 (https://www.acmicpc.net/problem/2798)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = search(arr, N, target);
        System.out.println(result);
	}
    
    public static int search(int[] arr, int N, int target) {
        int result = 0;
        
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    
                    if (target == temp) {
                        return temp;
                    }
                    
                    if (result < temp && temp < target) {
                        result = temp;
                    }
                }
            }
        }
        
        return result;
    }
}