package programmers;
import java.util.*;

/**
 * Date : 2020.09.29
 * Title : 제일 작은 수 제거하기 (https://programmers.co.kr/learn/courses/30/lessons/12935)
 * Difficulty : Level 1
 */
public class PM_level1_제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int[] temp = arr.clone(); // 깊은복사
        Arrays.sort(temp);
        int removeNum = temp[0];

        ArrayList<Integer> alist =  new ArrayList<>();
        for(int v : arr) {
            if(v != removeNum){
                alist.add(v);
            }
        }
        if(alist.size() == 0) {
            return answer;
        }
        answer = alist.stream().mapToInt(i->i).toArray();

        return answer;
    }
}
