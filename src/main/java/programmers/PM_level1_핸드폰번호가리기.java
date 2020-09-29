package programmers;

/**
 * Date : 2020.09.29
 * Title : 핸드폰 번호 가리기 (https://programmers.co.kr/learn/courses/30/lessons/12948)
 * Difficulty : Level 1
 */
public class PM_level1_핸드폰번호가리기 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);

        for(int i = 0; i<phone_number.length()-4; i++) {
            sb.setCharAt(i, '*');
        }

        return sb.toString();
    }
}
