package programmers;

/**
 * Date : 2020.09.29
 * Title : 자릿수 더하기 (https://programmers.co.kr/learn/courses/30/lessons/12931)
 * Difficulty : Level 1
 */
public class PM_level1_자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String[] sArr = Integer.toString(n).split("");

        for(int i = 0; i < sArr.length; i++) {
            answer += Integer.parseInt(sArr[i]);
        }

        return answer;
    }
}
