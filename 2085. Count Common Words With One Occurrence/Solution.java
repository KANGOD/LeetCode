import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Solution {
    public static void main(String[] args) {
        int countWords = new Solution().countWords(new String[]{"leetcode","is","amazing","as","is"},
                new String[]{"amazing","leetcode","is"});
        System.out.println(countWords);
    }

    @Test
    public void test1() {
        String[] word1 = new String[]{"leetcode","is","amazing","as","is"};
        String[] word2 = new String[]{"amazing","leetcode","is"};
        assertEquals(2, countWords(word1, word2));
    }

    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        // System.out.println(map1);
        Map<String, Integer> map2 = new HashMap<>();
        for (String s : words2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        // System.out.println(map2);

        int result = 0;
        for (String s : map1.keySet()) {
            if (map1.getOrDefault(s, 0) == 1 && map2.getOrDefault(s, 0) == 1) {
                result++;
            }
        }
        return result;
    }
}