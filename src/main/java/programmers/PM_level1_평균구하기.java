package programmers;

/**
 * Date : 2020.09.29
 * Title : 평균 구하기 (https://programmers.co.kr/learn/courses/30/lessons/12944)
 * Difficulty : Level 1
 */
public class PM_level1_평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        int arrCnt = arr.length;
        for(int i = 0; i < arrCnt ; i++) {
            sum += arr[i];
        }

        answer = sum/arrCnt;

        return answer;
    }
}
