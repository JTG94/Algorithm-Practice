package beakjoon;

import java.util.*;
import java.io.*;

/**
 * Date : 2021.07.17
 * Title : 달팽이는 올라가고 싶다 (https://www.acmicpc.net/problem/2869)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
	    int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V-B) / (A-B);
        if ((V-B) % (A-B) != 0) {
            day++;
        }

        System.out.println(day);
    }
}