package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Date : 2021.07.26
 * Title : 잃어버린 괄호 (https://www.acmicpc.net/problem/1541)
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        String[] minus_split = br.readLine().split("-");
		
        for (int i = 0; i < minus_split.length; i++) {
            String[] plus_split = minus_split[i].split("\\+");
            int temp = 0;
            for (int j = 0; j < plus_split.length; j++) {
                temp += Integer.parseInt(plus_split[j]);
            }
            
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        
        System.out.println(sum);
	}
}