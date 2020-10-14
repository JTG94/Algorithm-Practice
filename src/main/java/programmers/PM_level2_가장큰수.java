package programmers;
import java.util.*;

/**
 * Date : 2020.10.14
 * Title : 가장 큰 수 (https://programmers.co.kr/learn/courses/30/lessons/42746)
 * Difficulty : Level 2
 */
public class PM_level2_가장큰수 {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));


        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]);

        return sb.toString();
    }
}
