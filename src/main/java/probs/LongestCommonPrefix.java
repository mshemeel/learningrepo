package main.java.probs;

/**
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] arr = {"flow","flower","flight"};
        String previous = arr[0];
        for(int i =0; i<arr.length; i++){
            while(arr[i].indexOf(previous) != 0)
                previous = previous.substring(0,previous.length()-1);
        }
        System.out.println(previous);
    }
}
