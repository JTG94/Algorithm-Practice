package beakjoon;
import java.util.*;

/**
 * Date : 2021.07.03
 * Title : 요세푸스 문제 0 (https://www.acmicpc.net/problem/11866)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = sc.nextInt();
        int interval = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            q.offer(Integer.toString(i));
        }
        
        while(q.size() != 1) {
            for (int i = 0; i < interval-1; i++) {
                String pass = q.poll();
                q.offer(pass);
            }
            sb.append(q.poll()).append(", ");
        }
        
        sb.append(q.poll()).append(">");
        
        System.out.println(sb);
    }
}