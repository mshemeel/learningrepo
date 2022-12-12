package main.java.datastructure;

public class StringReverse {
    public static void main(String[] args) {
        String str = "How are you today ?";
        char[] strArr = str.toCharArray();
        reverse(strArr);
        /*StringBuilder reverseBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseBuilder.append(strArr[i]);
        }
        System.out.println(reverseBuilder);*/
        System.out.println(String.valueOf(strArr));
    }

    public static void reverse(char[] strArr) {
        int start = 0;
        int end = strArr.length-1;
        while (start < end) {
            char temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start ++;
            end --;
        }
    }
}
