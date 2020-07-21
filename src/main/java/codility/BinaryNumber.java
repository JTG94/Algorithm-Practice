package codility;
/**
 * Date : 2020.07.21
 * Title : Binary Number
 * Difficulty : Lesson 1
 */
public class BinaryNumber {
    public int solution(int A, int B) {
        // write your code in Java SE 8
        int value = A * B;
        int result = 0;
        while(value != 0) {
            if(value % 2 ==  1) {
                result++;
            }

            value = value/2;
        }
        return result;
    }
}
