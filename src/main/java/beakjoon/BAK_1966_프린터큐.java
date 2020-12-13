package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Date : 2020.12.13
 * Title : 1966 프린터 큐 (https://www.acmicpc.net/problem/1966)
 * Category : Simulation
 */
public class BAK_1966_프린터큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Queue queue = new LinkedList();

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer((br.readLine()));
            for (int j = 0; j < N; j++) {
                int pri = Integer.parseInt(st.nextToken());
                queue.add(new Document(j, pri));
            }

            int result = 1;

            while (!queue.isEmpty()) {
                Document currentDocu = (Document) queue.poll();
                boolean check = true;

                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    Document value = (Document) it.next();
                    if(currentDocu.pri < value.pri) {
                        check = false;
                        break;
                    }
                }

                if (check == false) {
                    queue.add(currentDocu);
                } else {
                    if (currentDocu.docuNumber == M) {
                        System.out.println(result);
                    } else {
                        result++;
                    }
                }
            }
        }
    }
}

class Document {
    int docuNumber; // 문서의 문서번호
    int pri; // 우선순위

    public Document(int docuNumber, int pri) {
        this.docuNumber = docuNumber;
        this.pri = pri;
    }
}
