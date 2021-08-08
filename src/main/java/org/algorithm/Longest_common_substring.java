package org.algorithm;

/**
 * 求最长公共字串
 *
 * 什么是动态规划？
 * 简单个人理解，就是记录之前的结果，然后在之前的结果之上进行迭代
 *
 */
public class Longest_common_substring {


    public static void main(String[] args) {
        String a = "";
        String b = "";
        Longest_common_substring longest_common_substring = new Longest_common_substring();
        int i = longest_common_substring.longest_1(a, b);
    }

    /**
     * 暴力求解
     * 输入：abcde bcd
     * 输出：3
     *
     * @param a
     * @param b
     * @return
     */
    private int longest_1(String a, String b) {
        if (a == null || b == null) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                int m = i;
                int n = j;
                int len = 0;
                //m和n同时移动，保证子串的连续性，比如第一次都从0开始，如果0号不相等，那就切换第二层的值为1，然后从外层0，内层1开始
                while (m < a.length() && n < b.length() && a.charAt(m++) == b.charAt(n++)) {
                    len++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }


    /**
     * 动态规划
     * 使用空间换时间复杂度，将转换为二位素组，对角线连续最长的值就是最大的公共子串<p/>
     * 参考：https://www.cnblogs.com/fanguangdexiaoyuer/p/11281179.html
     *
     * @param a
     * @param b
     * @return
     */
    private int longest_2(String s, String t) {
        if (s == null || t == null) {
            return 0;
        }
        int result = 0;
        int sLength = s.length();
        int tLength = t.length();
        int[][] dp = new int[sLength + 1][tLength + 1];
        for (int i = 1; i <= sLength; i++) {
            for (int k = 1; k <= tLength; k++) {
                if (s.charAt(i - 1) == t.charAt(k - 1)) {
                    dp[i][k] = dp[i - 1][k - 1] + 1;
                    result = Math.max(dp[i][k], result);
                }
            }
        }
        return result;
    }

}
