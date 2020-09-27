package programmers;
import java.util.*;

/**
 * Date : 2020.09.27
 * Title : 크레인 인형뽑기 게임 (https://programmers.co.kr/learn/courses/30/lessons/64061)
 * Difficulty : Level 1
 */
public class PM_level1_크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board[0].length; j++) {

                if(board[j][moves[i]-1] != 0) {
                    if(!st.empty() && st.peek() == board[j][moves[i]-1]) {
                        st.pop();
                        answer += 2;
                    } else {
                        st.push(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
