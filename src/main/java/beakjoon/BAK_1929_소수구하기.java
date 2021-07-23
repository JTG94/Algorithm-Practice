package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Date : 2021.07.23
 * Title : 소수 구하기 (https://www.acmicpc.net/problem/1929)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        first: for (int i = a; i <= b; i++) {
            if (i == 1) {
                continue;
            }
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue first;
                }
            }
            
            System.out.println(i);
        }
	}
}