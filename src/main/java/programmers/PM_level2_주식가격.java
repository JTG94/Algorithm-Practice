package programmers;

/**
 * Date : 2020.10.06
 * Title : 주식가격 (https://programmers.co.kr/learn/courses/30/lessons/42584)
 * Difficulty : Level 2
 */
public class PM_level2_주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length-1; i++) {
            int sec = 0;
            for(int j = i+1; j < prices.length; j++) {
                sec++;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = sec;
        }

        return answer;
    }
}
