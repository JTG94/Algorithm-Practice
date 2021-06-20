package programmers;
import java.util.*;

/**
 * Date : 2021.06.20
 * Title : [1차] 캐시 (https://programmers.co.kr/learn/courses/30/lessons/17680)
 * Difficulty : Level 2
 */
 public class PM_level2_[1차]캐시 {
    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;
    
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return CACHE_MISS * cities.length;
        int runtime = 0;
        
        LinkedList<String> cache = new LinkedList<>();
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            // cache hit
            if(cache.remove(city)) {
                cache.addFirst(city);
                runtime += CACHE_HIT;
            } else { // cache miss
                int currentCacheSize = cache.size();
                
                if (currentCacheSize == cacheSize) {
                    cache.pollLast();
                }
                
                cache.addFirst(city);
                runtime += CACHE_MISS;
            }
        }
        return runtime;
    }
 }