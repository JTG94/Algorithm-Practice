package beakjoon;
import java.util.*;

/**
 * Date : 2021.07.03
 * Title : 최대공약수와 최소공배수 (https://www.acmicpc.net/problem/2609)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println(a*b/gcd);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        
        return gcd(b, a % b);
    }
}