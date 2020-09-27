package programmers;

/**
 * Date : 2020.09.27
 * Title : 소수 찾기 (https://programmers.co.kr/learn/courses/30/lessons/12921)
 * Difficulty : Level 1
 */
public class PM_level1_소수찾기 {
    public int solution(int n) {
        int answer = 0;
        boolean[] sosu = new boolean[n+1];

        for(int i = 2; i<=n; i++) {
            sosu[i] = true;
        }

        int root=(int)Math.sqrt(n);

        for(int i=2; i<=root; i++) {
            if(sosu[i]==true) {
                for(int j=i; i*j<=n; j++) {
                    sosu[i*j]=false;
                }
            }
        }

        for(int i=2; i<=n; i++) {
            if(sosu[i]==true)
                answer++;
        }

        return answer;
    }
}
