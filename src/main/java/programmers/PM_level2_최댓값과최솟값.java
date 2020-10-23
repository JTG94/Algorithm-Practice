package programmers;
import java.util.*;

/**
 * Date : 2020.10.23
 * Title : 최댓값과 최솟값 (https://programmers.co.kr/learn/courses/30/lessons/12939)
 * Difficulty : Level 2
 */
public class PM_level2_최댓값과최솟값 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        int[] int_arr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int_arr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(int_arr);
        sb.append(int_arr[0] + " " + int_arr[int_arr.length-1]);
        return sb.toString();
    }
}
