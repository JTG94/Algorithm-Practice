package programmers;

/**
 * Date : 2020.10.06
 * Title : 스킬트리 (https://programmers.co.kr/learn/courses/30/lessons/49993)
 * Difficulty : Level 2
 */
public class PM_level2_스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length;i++){
            boolean flag = true;
            String[] skills = skill_trees[i].split("");
            int cnt =0;
            for(int j=0;j<skills.length;j++){
                if(cnt < skill.indexOf(skills[j])){
                    flag = false;
                    break;
                } else if(cnt == skill.indexOf(skills[j])) {
                    cnt++;
                }
            }

            if(flag){
                answer++;
            }
        }
        return answer;
    }
}
