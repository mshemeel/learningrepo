package main.java.learn;

import java.util.HashMap;
import java.util.Map;

/**
 * longest-substring-without-repeating-characters
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeating {

    public  static  void  main(String [] ar){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        Map<Character,Integer> hmap = new HashMap<>();
        char [] charArr = s.toCharArray();
        int max = 0;
        int i = 0;
        int j = 0;
        for(char ch : charArr){
            if(hmap.containsKey(ch)){
                j = Math.max(j,hmap.get(ch)+1);
            }
            hmap.put(ch,i);
            max = Math.max(max,i-j+1);

            i++;
        }
        return max;


    }


}
