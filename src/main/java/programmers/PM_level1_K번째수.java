package programmers;
import java.util.Arrays;

/**
 * Date : 2020.09.27
 * Title : K번째수 (https://programmers.co.kr/learn/courses/30/lessons/42748)
 * Difficulty : Level 1
 */
public class PM_level1_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


        for(int i=0; i<commands.length; i++) {
            int[] temp = new int[commands[i][1]-commands[i][0]+1];

            int idx = 0;
            for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
                temp[idx++] = array[j];
            }
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
