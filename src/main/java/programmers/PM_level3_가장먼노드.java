package programmers;
import java.util.*;

/**
 * Date : 2020.10.18
 * Title : 가장 먼 노드 (https://programmers.co.kr/learn/courses/30/lessons/49189)
 * Difficulty : Level 3
 */
public class PM_level3_가장먼노드 {
    public int solution(int n, int[][] edge) {
        int answer = 0;

        boolean[] isVisit = new boolean[n+1]; // 방문 여부
        boolean[][] vertex = new boolean[n+1][n+1]; // 인접행렬 그래프 정보

        //인접행렬 초기화
        for(int i = 0; i < edge.length; i++) {
            int a1 = edge[i][0];
            int a2 = edge[i][1];

            vertex[a1][a2] = true;
            vertex[a2][a1] = true;
        }

        int v = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        isVisit[1] = true;

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                v = q.poll();
                for(int j = 1; j <= n; j++) {
                    if(vertex[v][j] && !isVisit[j]) {
                        isVisit[j] = true;
                        q.add(j);
                    }
                }
            }
            answer = size;
        }
        return answer;
    }
}
