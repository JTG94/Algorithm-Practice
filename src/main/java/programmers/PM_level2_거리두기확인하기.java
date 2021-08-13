package programmers;
import java.util.*;

/**
 * Date : 2021.08.13
 * Title : 거리두기 확인하기 (https://programmers.co.kr/learn/courses/30/lessons/81302)
 * Difficulty : Level 2
 */
class PM_level2_거리두기확인하기 {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for (int i = 0; i < places.length; i++) {
            answer[i] = is_keep_distance(places[i]);
        }
        return answer;
    }
    
    public int is_keep_distance(String[] waiting_room) {
        int result = 1;
        for (int i = 0; i < waiting_room.length; i++) {
            for (int j = 0; j < waiting_room[i].length(); j++) {
                if (waiting_room[i].charAt(j) == 'P') {
                    if (!bfs(waiting_room, i, j)) return 0;
                }
            }
        }
        
        return result;
    }
    
    public boolean bfs (String[] waiting_room, int x, int y) {
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited = new boolean[waiting_room.length][waiting_room.length];
        q.offer(new Node(x, y));
        visited[x][y] = true;
        
        while(!q.isEmpty()) {
            Node current = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                int manhattan_dist = Math.abs(x - nx) + Math.abs(y - ny);
                
                if (nx < 0 || ny < 0 || nx >= waiting_room.length || ny >= waiting_room.length) continue;
                
                if (visited[nx][ny] || manhattan_dist > 2) continue;
                
                visited[nx][ny] = true;
                if (waiting_room[nx].charAt(ny) == 'X') continue;
                else if (waiting_room[nx].charAt(ny) == 'P') return false;
                else q.offer(new Node(nx, ny));
            }
        }
        return true;
    }
    
    public class Node {
        int x;
        int y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}