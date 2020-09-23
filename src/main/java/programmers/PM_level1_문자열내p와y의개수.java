package programmers;

/**
 * Date : 2020.09.23
 * Title : 문자열 내 p와 y의 개수 (https://programmers.co.kr/learn/courses/30/lessons/12916)
 * Difficulty : Level 1
 */
public class PM_level1_문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;

        char[] chs = s.toCharArray();
        for(int i = 0; i < chs.length; i++) {
            if(Character.toLowerCase(chs[i]) == 'p') {
                pCnt++;
            }
            if(Character.toLowerCase(chs[i]) == 'y') {
                yCnt++;
            }
        }

        if(pCnt != yCnt) {
            answer = false;
        }

        return answer;
    }
}
