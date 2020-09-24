package programmers;

/**
 * Date : 2020.09.24
 * Title : 가운데 글자 가져오기 (https://programmers.co.kr/learn/courses/30/lessons/12903)
 * Difficulty : Level 1
 */
public class PM_level1_가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        char[] chs = s.toCharArray();


        int flag = chs.length%2;
        int index = chs.length/2;
        if(flag == 0) {
            answer = String.valueOf(chs[index-1])+String.valueOf(chs[index]);
        } else {
            answer = String.valueOf(chs[index]);
        }

        return answer;
    }
}
