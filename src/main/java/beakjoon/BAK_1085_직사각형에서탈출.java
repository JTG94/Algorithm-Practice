package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Date : 2021.07.23
 * Title : 직사각형에서 탈출 (https://www.acmicpc.net/problem/1085)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[4];
        
        arr[0] = w-x;
        arr[1] = x-0;
        arr[2] = h-y;
        arr[3] = y-0;
        
        Arrays.sort(arr);

        System.out.println(arr[0]);
	}
}