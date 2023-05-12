package main.java.probs;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll(
                "[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        String rs = "";
        for(int i= s.length()-1; i>=0 ; i--){
           rs = rs.concat(String.valueOf(s.charAt(i)));
        }

        if(rs.equalsIgnoreCase(s)){
            System.out.println(true);
        }

        if (reverse.equalsIgnoreCase(s)) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll(
                "[^a-zA-Z0-9]", "").trim();
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        if(reverse.equals(s)){
            return true;
        }
        return false;
    }
}
