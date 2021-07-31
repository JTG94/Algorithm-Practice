package programmers;

/**
 * Date : 2021.07.31
 * Title : 소수 만들기 (https://programmers.co.kr/learn/courses/30/lessons/12977)
 * Difficulty : Level 1
 */
class PM_level1_소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        int L = nums.length;
        
        for (int i = 0; i < L - 2; i++ ) {
            for (int j = i+1; j < L - 1; j++) {
                for (int k = j+1; k < L; k++) {
                    boolean check = checkNumber(nums[i] + nums[j] + nums[k]);
                    if (check) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public static boolean checkNumber(int N) {
        boolean flag = true;
        
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                flag = false;
                break;
            } 
        }
        
        return flag;
    }
}