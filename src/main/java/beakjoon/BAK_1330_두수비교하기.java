package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.27
 * Title : 1330 두 수 비교하기 (https://www.acmicpc.net/problem/1330)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a>b) System.out.println(">");
        else if(a<b) System.out.println("<");
        else System.out.println("==");
    }
}