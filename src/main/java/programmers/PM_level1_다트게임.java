package programmers;

/**
 * Date : 2020.10.05
 * Title : [1차] 다트 게임 (https://programmers.co.kr/learn/courses/30/lessons/17682)
 * Difficulty : Level 1
 */
public class PM_level1_다트게임 {
    public int solution(String dartResult) {
        int[] basic_score = new int[3];
        int index = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            char dartChar = dartResult.charAt(i);
            int dartInt = Character.getNumericValue(dartChar);

            if(dartInt >= 0 && dartInt <= 10) {
                //1이올경우 10인지 1인지 판별
                if(dartInt == 1) {
                    if(Character.getNumericValue(dartResult.charAt(i+1)) == 0) {
                        dartInt = 10;
                        i++;
                    }
                }
                basic_score[index] = dartInt;
            } else {
                if(dartChar == 'S') {
                    basic_score[index] = (int)Math.pow(basic_score[index], 1);
                    index++;
                } else if (dartChar == 'D') {
                    basic_score[index] = (int)Math.pow(basic_score[index], 2);
                    index++;
                } else if (dartChar == 'T') {
                    basic_score[index] = (int)Math.pow(basic_score[index], 3);
                    index++;
                } else if (dartChar == '*') {
                    basic_score[index-1] *= 2;
                    if(index > 1) {
                        basic_score[index-2] *= 2;
                    }
                } else if (dartChar == '#') {
                    basic_score[index-1] *= -1;
                }
            }
        }

        return basic_score[0] + basic_score[1] + basic_score[2];
    }
}
