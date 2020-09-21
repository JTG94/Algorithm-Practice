package programmers;
import java.util.*;

/**
 * Date : 2020.09.21
 * Title : 두 개 뽑아서 더하기 (https://programmers.co.kr/learn/courses/30/lessons/68644)
 * Difficulty : Level 1
 */
public class PM_level1_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> sumList = new ArrayList<Integer>();

        for(int i=0; i< numbers.length-1; i++) {
            for(int j=i+1; j< numbers.length; j++) {
                if(!sumList.contains(numbers[i] + numbers[j])) {
                    sumList.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(sumList);
        answer = new int[sumList.size()];
        for(int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }

        return answer;
    }
}
