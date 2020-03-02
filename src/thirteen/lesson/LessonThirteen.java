package thirteen.lesson;

import java.util.Arrays;

public class LessonThirteen {

    public static void main(String[] args){
        String randomString = "I'm just a string";
        String gotToQuote = "He said, \"I'm here!\"";

        // \n \b \" \\

        int num = 2;
        System.out.println(randomString + " " + gotToQuote + num);

        String upperCase = "BIG";
        String lowerCase = "big";

        if(!upperCase.equals(lowerCase)){
            System.out.println("Not Equal!");
        }
        if(upperCase.equalsIgnoreCase(lowerCase)){
            System.out.println("Equal!");
        }

        String letters = "abcdef";
        String moreLetters = "ghijk";

        //System.out.println("2nd char: " + letters.charAt(1));
        System.out.println(letters.compareTo(moreLetters));
        System.out.println(letters.contains("abc"));
        System.out.println(letters.endsWith("ef"));
        System.out.println(letters.indexOf("cde"));

        String repeatedChars = "abcadefaahgjutavb,mbopteh'jagfbgnk;labvgd";
        System.out.println(repeatedChars.lastIndexOf("'"));
        System.out.println(repeatedChars.length());
        System.out.println(repeatedChars.replace("jut", "abc"));

        String[] letterArray = repeatedChars.split("a");

        System.out.println(Arrays.toString(letterArray));

        char[] charArray = repeatedChars.toCharArray();

        System.out.println(letters.substring(1,4));
        System.out.println(letters.toUpperCase());
        System.out.println(letters.toLowerCase());

        String trimString = "    gsh     ";
        System.out.println(trimString.trim());
        System.out.println(trimString);

        StringBuilder randSB = new StringBuilder("A rand value");
        System.out.println(randSB.append(" again"));
        System.out.println(randSB);
        System.out.println(randSB.delete(3,4));
        System.out.println(randSB);

        System.out.println(randSB.capacity());
        randSB.ensureCapacity(60);
        System.out.println(randSB.capacity());
        System.out.println(randSB.length());
        randSB.trimToSize();
        System.out.println(randSB.capacity());
        System.out.println(randSB.length());
        System.out.println(randSB.insert(1, "nother"));
        String oldSB = randSB.toString();
        System.out.println(oldSB);


    }
}
