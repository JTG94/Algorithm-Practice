package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Date : 2021.07.03
 * Title : 숫자 카드 2 (https://www.acmicpc.net/problem/10816)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        String[] in;
        
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        in = br.readLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(in[i]);
            
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        
        int m = Integer.parseInt(br.readLine());
        in = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(in[i]);
            
            if (map.containsKey(key)) {
                sb.append(map.get(key)).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }
        
        System.out.println(sb);
    }
}