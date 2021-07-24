package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Date : 2021.07.24
 * Title : 체스판 다시 칠하기 (https://www.acmicpc.net/problem/1018)
 */
public class Main {
    
    public static boolean[][] arr;
    public static int min = 64;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        arr = new boolean[N][M];
        
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        
        int start_row = N - 7;
        int start_col = M - 7;
        
        for (int i = 0; i < start_row; i++) {
            for (int j = 0; j < start_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
	}
    
    public static void find(int x, int y) {
        int end_row = x + 8;
        int end_col = y + 8;
        int count = 0;
        
        boolean TF = arr[x][y];
        
        for (int i = x; i < end_row; i++) {
            for (int j = y; j < end_col; j++) {
                
                if (arr[i][j] != TF) {
                    count++;
                }
                
                TF = !TF;
            }
            TF = !TF;
        }
        
        count = Math.min(count, 64 - count);
        
        min = Math.min(min, count);
    }
}