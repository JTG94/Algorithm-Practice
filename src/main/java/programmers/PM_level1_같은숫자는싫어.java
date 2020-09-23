package programmers;
import java.util.*;

/**
 * Date : 2020.09.23
 * Title : 같은 숫자는 싫어 (https://programmers.co.kr/learn/courses/30/lessons/12906)
 * Difficulty : Level 1
 */
public class PM_level1_같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> distinctList = new ArrayList<>();

        int size = arr.length;
        int temp;

        distinctList.add(arr[0]);
        for(int i = 1; i < size; i++) {
            temp = arr[i-1];
            if(temp != arr[i]) {
                distinctList.add(arr[i]);
            }
        }
        answer = new int[distinctList.size()];
        answer = distinctList.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
