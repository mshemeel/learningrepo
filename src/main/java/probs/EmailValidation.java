package main.java.probs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ^                        # start of the line
 * (?=.{1,64}@)            # local-part min 1 max 64
 *
 * [A-Za-z0-9_-]+          # Start with chars in the bracket [ ], one or more (+)
 *                           # dot (.) not in the bracket[], it can't start with a dot (.)
 *
 * (\\.[A-Za-z0-9_-]+)*	 # follow by a dot (.), then chars in the bracket [ ] one or more (+)
 * # * means this is optional
 * # this rule for two dots (.)
 *
 * @ # must contains a @ symbol
 * <p>
 * [^-]                    # domain can't start with a hyphen (-)
 * <p>
 * [A-Za-z0-9-]+           # Start with chars in the bracket [ ], one or more (+)
 * <p>
 * (\\.[A-Za-z0-9-]+)*      # follow by a dot (.), optional
 * <p>
 * (\\.[A-Za-z]{2,})       # the last tld, chars in the bracket [ ], min 2
 * $                        #end of line
 *
 * "^[A-Za-z0-9_]+"
 *       +"@"
 *       +"[a-z-]+"
 *       +"(\\.[a-z]{2,})$";
 */
public class EmailValidation {
    /*private static final String EMAIL_PATTERN =
            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                    + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
*/

    private static final String EMAIL_PATTERN =
            "^[A-Za-z0-9_-]+"  //first part
                    + "@"   //@
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*" //domain name
                    + "(\\.[A-Za-z]{2,})$"; // .com or .co.uk
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static void main(String[] args) {
        System.out.println(isValid("mshemeel007@gmail.com"));
    }

    public static boolean isValid(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
