package programmers;

/**
 * Date : 2020.10.26
 * Title : 행렬의 곱셈 (https://programmers.co.kr/learn/courses/30/lessons/12949)
 * Difficulty : Level 2
 */
public class PM_level2_행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i=0; i<answer.length; i++) {
            for(int j=0; j<answer[0].length; j++) {
                for(int k=0; k<arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
