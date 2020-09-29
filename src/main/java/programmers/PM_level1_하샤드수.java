package programmers;

/**
 * Date : 2020.09.29
 * Title : 하샤드 수 (https://programmers.co.kr/learn/courses/30/lessons/12947)
 * Difficulty : Level 1
 */
public class PM_level1_하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        String[] sArr = Integer.toString(x).split("");
        int sum = 0;
        for(int i = 0; i < sArr.length; i++) {
            sum += Integer.parseInt(sArr[i]);
        }

        if(x%sum != 0) {
            answer = false;
        }

        return answer;
    }
}
