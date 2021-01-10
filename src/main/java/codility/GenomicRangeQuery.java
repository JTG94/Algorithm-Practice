package codility;
/**
 * Date : 2021.01.10
 * Title : GenomicRangeQuery
 * Difficulty : Lesson 5 - Prefix Sums
 * Detected time complexity : O(N + M)
 */
public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
            
        int aCnt[] = new int[S.length()+1];
        int cCnt[] = new int[S.length()+1];
        int gCnt[] = new int[S.length()+1];
        
        int min[] = new int[P.length];
        
        int ptmp;
        int qtmp;
        
        for(int i = 0; i < S.length(); i++){
            
            aCnt[i+1] = aCnt[i];
            cCnt[i+1] = cCnt[i];
            gCnt[i+1] = gCnt[i];
            
            if(S.charAt(i) == 'A'){
                aCnt[i+1]++;
            }
            else if(S.charAt(i) == 'C'){
                cCnt[i+1]++;
            }
            else if(S.charAt(i) == 'G'){
                gCnt[i+1]++;
            }
        }
        
        for(int j = 0; j < P.length; j++){
            ptmp = P[j];
            qtmp = Q[j];
            
            if(aCnt[ptmp] != aCnt[qtmp+1]){
                min[j] = 1;
            }
            else if(cCnt[ptmp] != cCnt[qtmp+1]){
                min[j] = 2;
            }
            else if(gCnt[ptmp] != gCnt[qtmp+1]){
                min[j] = 3;
            }
            else{
                min[j] = 4;
            }
        }
        
        return min;
    }
}
