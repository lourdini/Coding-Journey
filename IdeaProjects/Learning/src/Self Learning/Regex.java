package School;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        // (.) Any character except newline.
    /*
        String re = ".";
        String text = "a";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();

        // Can be: boolean result = matcher.find();

        System.out.println(result);
    */
        // The number of (.) corresponds with the number of char
    /*
        String re = "...";
        String text = "a15";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    */
        // (\w) Word character (a-z,A-Z,0-9,...)
    /*
        String re = "\\w\\w\\w";
        String text = "a15";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    */
        // (\W) Not a word character
    /*
        String re = "\\w\\W";
        String text = "5%";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    */
        // (\s) Whitespaced character
        // (\S) Non-whitespace character
    /*
        String re = "\\w\\s\\W";
        String text = "5 %";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    */
        // (\d) Any digit. Same as to [0-9]
        // (\D) Nondigits
    /*
        String re = "\\d\\D";
        String text = "5Y";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    */
        // String Name Validation
        // [Aa] or [A|a] matches Lowercase and Uppercase
    /*
        String re = "[A-Z][a-z]+";
        String text = "Lourd";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    */
        // {n} Specifies the number of times it is valid
        // {n,} Minimum to infinity
        // {3,4} 3 or 4 is True
    /*
        String re = "\\d{3}";
        String text = "105";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    */
        // (+) Must have at least one
        // (*) Can be ignored
    /*
        String re = "\\w*\\d+@gmail.com";
        String text = "lourdanthony17@gmail.com";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    */
    /*
        String re = "\\w*\\d+@gmail.com";
        String text = "lourdanthony17@gmail.com";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        if(mt.matches()){
            System.out.println("Found it");
        }else{
            System.out.println("Did not");
        }
*/

        Scanner s = new Scanner(System.in);


        String re = "[A|a|B|b|C|c]";
        Pattern pt = Pattern.compile(re);
        String choice = "";
        Matcher mt = pt.matcher(choice);


        for(int i = 0;i<1;i++) {
            System.out.println("Select your choice: ");
            if (s.hasNext("[A|a|B|b|C|c]")) {
                System.out.println("Found!");
                //choice = s.next();
                //i = 1;
            } else {
                s.next();
                i--;
            }
        }

        System.out.println(choice);


    }

}
