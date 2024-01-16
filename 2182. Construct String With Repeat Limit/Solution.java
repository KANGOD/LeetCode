import static org.junit.Assert.assertEquals;

class Solution {
    public static void main(String[] args) {
        assertEquals("zzcccac", new Solution().repeatLimitedString("cczazcc", 3));
        assertEquals("bbabaa", new Solution().repeatLimitedString("aababab", 2));
        assertEquals("ddcdcc", new Solution().repeatLimitedString("ccdcdcd", 2));
    }

    public String repeatLimitedString(String s, int repeatLimit) {
        int[] charTimes = new int[26];
        for (char c : s.toCharArray()) {
            charTimes[c - 'a']++;
        }
        // System.out.println(Arrays.toString(charTimes));

        StringBuilder result = new StringBuilder();

        int maxCharIndex = charTimes.length - 1;
        int secondMaxCharIndex = charTimes.length - 2;

        int currentTailingMaxCharCount = 0;

        // 1. maxCharIndex < 0 则所有字符已被填完，终止循环
        // 2. secondMaxCharIndex < 0，则 secondMaxCharIndex 不再是初始值 24，曾被修改过，即曾经触发过填写第二大的字符；
        //    而且现在第二大的字符被填完了；
        //    说明 charTimes 中现在只包含一个字符，最大字符。
        //   只有最大字符已经填写到了 repeatLimit 上限，才会去消耗第二大字符；
        //   第二大字符被耗尽，索引变成负值，说明尝试填第二大字符失败，此时最大字符也已经到达 repeatLimit 上限，不能填最大字符，故循环终止。
        while(maxCharIndex >= 0 && secondMaxCharIndex >= 0) {
            if (charTimes[maxCharIndex] <= 0) {
                maxCharIndex--;
                currentTailingMaxCharCount = 0;
                continue;
            }
            if (currentTailingMaxCharCount < repeatLimit) {
                char c = (char) (maxCharIndex + 'a');
                result.append(c);
                currentTailingMaxCharCount++;
                charTimes[maxCharIndex]--;
                continue;
            }

            // Maintain secondMaxCharIndex
            while (secondMaxCharIndex >= maxCharIndex
                    || (secondMaxCharIndex >= 0 && charTimes[secondMaxCharIndex] <= 0)) {
                secondMaxCharIndex--;
                continue;
            }
            if (secondMaxCharIndex >= 0) {
                char c = (char) (secondMaxCharIndex + 'a');
                result.append(c);
                currentTailingMaxCharCount = 0;
                charTimes[secondMaxCharIndex]--;
            }
        }

        return result.toString();
    }
}