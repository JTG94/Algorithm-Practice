package programmers;

/**
 * Date : 2020.10.11
 * Title : 다음 큰 숫자 (https://programmers.co.kr/learn/courses/30/lessons/12911)
 * Difficulty : Level 2
 */
public class PM_level2_다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        int oneCnt = oneCount(Integer.toBinaryString(n));

        n += 1;
        while(true) {
            if(oneCnt == oneCount(Integer.toBinaryString(n))) {
                answer = n;
                break;
            }
            n++;

        }
        return answer;
    }

    public static int oneCount(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                result++;
            }
        }

        return result;
    }
}
