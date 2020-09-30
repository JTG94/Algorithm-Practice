package programmers;

/**
 * Date : 2020.09.30
 * Title : 비밀지도 (https://programmers.co.kr/learn/courses/30/lessons/17681)
 * Difficulty : Level 1
 */
public class PM_level1_비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] Binary1 = transNumToBinary(arr1);
        String[] Binary2 = transNumToBinary(arr2);

        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < n; j++) {
                if(Binary1[i].charAt(j) == '0' && Binary2[i].charAt(j) == '0') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }

            answer[i] = sb.toString();
        }

        return answer;
    }

    static public String[] transNumToBinary(int[] arr) {
        String[] s = new String[arr.length];

        for(int i = 0; i < arr.length; i++) {
            s[i] = Integer.toBinaryString(arr[i]);

            int length = s[i].length();
            if(length != arr.length) {
                int cnt = arr.length - length;

                String a = "";
                for(int j = 0; j < cnt; j++) {
                    a += "0";
                }
                s[i] = a+s[i];
            }

        }

        return s;
    }
}
