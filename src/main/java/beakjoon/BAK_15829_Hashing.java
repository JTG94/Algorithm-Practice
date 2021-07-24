package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Date : 2021.07.24
 * Title : Hashing (https://www.acmicpc.net/problem/15829)
 */
public class Main {
    public static int M = 1234567891;
    public static int r = 31;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        long result = 0;
      	for(int i = 0;i < L; i++){
			result += (str.charAt(i)-'a'+1) * pow(r,i);
		}
		System.out.println(result % M);
	}
	static long pow(int a,int b){
		return b == 0 ? 1 : a * pow(a, b-1) % M;
	}
}