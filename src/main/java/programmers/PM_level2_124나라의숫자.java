package programmers;

/**
 * Date : 2020.10.19
 * Title : 124 나라의 숫자 (https://programmers.co.kr/learn/courses/30/lessons/12899)
 * Difficulty : Level 2
 */
public class PM_level2_124나라의숫자 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int rmd;

        while(n>0){
            rmd = n%3;
            n = n/3;

            if(rmd == 0){
                n -= 1;
                rmd = 4;
            }

            sb.insert(0, rmd);
        }
        return sb.toString();
    }
}
