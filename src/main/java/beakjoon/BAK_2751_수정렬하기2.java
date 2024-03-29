package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Date : 2021.07.23
 * Title : 수 정렬하기 2 (https://www.acmicpc.net/problem/2751)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(list);
        
        for (Integer num : list) {
            sb.append(num).append('\n');
        }
        
        System.out.println(sb);
	}
}