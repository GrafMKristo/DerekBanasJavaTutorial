package nineteen.lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LessonNineteen {

    public static void main(String[] args) {
        String longString = " Derek Banas CA 12345 PA AL (412)555-1212 CTjohnsmith@hotmail.comAZ 412-555-1234 412 555-1234";
        String strangeString = "17 AAA **** *** {{{ {{ { ";

        System.out.println("----------- WORD 2 TO 20 CHARS");
        // [A-Za-z]{2,20}  or   \\w{2,20}
        //regexChecker("\\s[A-Za-z]{2,20}\\s", longString);

        System.out.println("----------- ZIP code 5 digits long");
        //regexChecker("\\s\\d{5}\\s", longString);

        System.out.println("----------- States starting with A or C");
        //regexChecker("A[KLRZ]|C[AOT]", longString);

        // {5,} - only minimum bounds
        // + - one or more time
        // .^*+?{}[]\|() - symbols to be backslashed

        // stars, brackets
        //regexChecker("\\{{2,}", strangeString);

        // zero or more times
        //regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", longString);

        //different phones
        //regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?)([0-9]{4}|[a-zA-Z0-9]{7})", longString);

        regexReplace(longString);
    }


    public static void regexChecker(String theRegex, String str2chk) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(str2chk);

        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                System.out.println(regexMatcher.group().trim());
            }

            System.out.println("start index: " + regexMatcher.start());
            System.out.println("End index: " + regexMatcher.end());
        }
    }

    public static void regexReplace(String str2Replace) {
        Pattern replace = Pattern.compile("\\s+");

        Matcher regexMatcher = replace.matcher(str2Replace.trim());

        System.out.println(regexMatcher.replaceAll(", "));
    }

}
