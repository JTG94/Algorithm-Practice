package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.27
 * Title : 11399 ATM (https://www.acmicpc.net/problem/11399)
 * Category : Sort
 */
public class BAK_11399_ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i =0 ; i<N; i++) {
            int inputNum = in.nextInt();
            arr[i] = inputNum;
        }
        
        Arrays.sort(arr);
        int sum = 0;
        int prev = 0;
        for(int i = 0; i < N; i++) {
            sum += prev + arr[i];
            
            prev += arr[i];
        }
        
        System.out.println(sum);
    }
}   
