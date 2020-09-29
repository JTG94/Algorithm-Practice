package programmers;

/**
 * Date : 2020.09.29
 * Title : 자연수 뒤집어 배열로 만들기 (https://programmers.co.kr/learn/courses/30/lessons/12932)
 * Difficulty : Level 1
 */
public class PM_level1_자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String[] sArr = Long.toString(n).split("");
        int[] answer = new int[sArr.length];

        int idx = 0;
        for(int i = sArr.length-1; i >= 0; i--) {
            answer[idx] = Integer.parseInt(sArr[i]);
            idx++;
        }

        return answer;
    }
}
