package main.java.probs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
^                       # start of the line
(?=.{1,64}@)            # local-part min 1 max 64

[A-Za-z0-9_-]+          # Start with chars in the bracket [ ], one or more (+)
                        # dot (.) not in the bracket[], it can't start with a dot (.)

(\\.[A-Za-z0-9_-]+)*	 # follow by a dot (.), then chars in the bracket [ ] one or more (+)
                        # * means this is optional
                        # this rule for two dots (.)

@                       # must contains a @ symbol

[^-]                    # domain can't start with a hyphen (-)

[A-Za-z0-9-]+           # Start with chars in the bracket [ ], one or more (+)

(\\.[A-Za-z0-9-]+)*      # follow by a dot (.), optional

(\\.[A-Za-z]{2,})       # the last tld, chars in the bracket [ ], min 2

$                       # end of the line
 */

public class EmailRegex {
    private static final String REGEX = "^[a-z0A-Z-9-]+"//part 1 name
            + "@" //part 2 @ symbol
            + "[A-Za-z0-9-]+" // part 3 domain name
            + "(\\.[A-Za-z0-9-]+)*"  // part 4 (.) dot -> cannot have 2 dots : should be followed by chars
            + "(\\.[A-Za-z]{2,})$"  ;//tld part 5
    private static final Pattern pattern = Pattern.compile(REGEX);

    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // Reading data using readLine
        //String name = reader.readLine();
        String name = "test@test.com";
        // Printing the read line
        System.out.println(isValid(name));

    }

    public static boolean isValid(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
