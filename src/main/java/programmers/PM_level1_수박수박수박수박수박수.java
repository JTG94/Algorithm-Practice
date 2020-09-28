package programmers;

/**
 * Date : 2020.09.28
 * Title : 수박수박수박수박수박수? (https://programmers.co.kr/learn/courses/30/lessons/12922)
 * Difficulty : Level 1
 */
public class PM_level1_수박수박수박수박수박수 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        int subak = n/2;
        int su = n%2;

        for(int i = 0; i<subak; i++) {
            sb.append("수박");
        }
        if(su == 1) {
            sb.append("수");
        }
        return sb.toString();
    }
}
