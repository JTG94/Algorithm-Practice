package programmers;
import java.util.*;

/**
 * Date : 2020.09.23
 * Title : 나누어 떨어지는 숫자 배열 (https://programmers.co.kr/learn/courses/30/lessons/12910)
 * Difficulty : Level 1
 */
public class PM_level1_나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        answer = new int[1];
        answer[0] = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.size() != 0) {
            answer = new int[list.size()];
            Collections.sort(list);
            answer = list.stream().mapToInt(i -> i).toArray();
        }

        return answer;
    }
}
