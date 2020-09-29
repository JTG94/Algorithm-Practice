package programmers;

/**
 * Date : 2020.09.29
 * Title : 짝수와 홀수 (https://programmers.co.kr/learn/courses/30/lessons/12937)
 * Difficulty : Level 1
 */
public class PM_level1_짝수와홀수 {
    public String solution(int num) {
        String answer = "Odd";
        if(num%2 == 0) {
            answer = "Even";
        }

        return answer;
    }
}
