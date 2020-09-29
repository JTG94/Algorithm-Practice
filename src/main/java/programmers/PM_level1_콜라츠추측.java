package programmers;

/**
 * Date : 2020.09.29
 * Title : 콜라츠 추측 (https://programmers.co.kr/learn/courses/30/lessons/12943)
 * Difficulty : Level 1
 */
public class PM_level1_콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        // 3*num+1 연산시 오버플로우 고려
        long num2 = (long) num;

        int i = 0;
        for(i = 0; i < 500; i++) {
            if(num2 == 1) {
                break;
            }

            if(num2 % 2 == 0) {
                num2 /= 2;
            } else {
                num2 = num2*3+1;
            }
        }
        if (num2 != 1) {
            answer = -1;
        } else {
            answer = i;
        }
        return answer;
    }
}
