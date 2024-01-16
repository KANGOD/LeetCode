import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution {
    @Test
    public void test_abc() {
        assertEquals(0, addMinimum("abc"));
    }
    
    public int addMinimum(String word) {
        if (word.length() == 1) {
            return 2;
        }
        int n = word.length();
        int count = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) >= word.charAt(i)) {
                count++;
            }
        }
        return count * 3 - n;
    }

}
