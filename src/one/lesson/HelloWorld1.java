package one.lesson;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class HelloWorld1 {
    static String randomString = "String to print";
    static final double PINUM = 3.1415;

    public static void main(String[] args) {
        System.out.println(PINUM);

        int integerOne
                = 22;
        int integerTwo
                = integerOne + 1;

        System.out.println(integerTwo);

        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long  bigLong = 9200000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.14645756867897695759;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 66;
        char anotherChar = 'A';

        char escapeChar = '\\';

        String randomString1 = "I'm random String!";
        String anotherRandomString1 = "Stuff!";
        String resultString = randomString1 + ' ' + anotherRandomString1;
        System.out.println(resultString);

        System.out.println(randomChar);
        System.out.println(escapeChar);
        System.out.println(anotherChar);

        String byteString = Byte.toString(bigByte);
        String intString = Integer.toString(bigInt);
        System.out.println(byteString);

        double aDoubleValue = 30000000000000.1476879;
        int doubleInt = (int) aDoubleValue;

        System.out.println(doubleInt);

        int  stringToInt = Integer.parseInt(intString);

        boolean parsedBool = Boolean.parseBoolean("True");

        if (parsedBool){
            System.out.println(true);
        } else System.out.println("False");
        System.out.println(stringToInt);
    }
}