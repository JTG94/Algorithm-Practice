package beakjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * Date : 2020.12.08
 * Title : 2750 수 정렬하기 (https://www.acmicpc.net/problem/2750)
 * Category : Sort
 */
public class BAK_2750_수정렬하기 {
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        for(int i =0 ; i<N; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            if(!q.contains(inputNum))
            q.offer(inputNum);
        }

        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
