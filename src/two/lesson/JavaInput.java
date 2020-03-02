package two.lesson;
import java.util.Scanner;

public class JavaInput{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Your favourite number");

        if (userInput.hasNextInt()){
            int numberEntered = userInput.nextInt();

            System.out.println("You entered " + numberEntered);

            int numEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
            int numEnteredTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
            int numEnteredModulus3 = numberEntered %3;
            System.out.println(numberEntered + " % 3 = " + numEnteredModulus3);

            numberEntered += 2;
            numberEntered *= 2;
            numberEntered -= 2;
            numberEntered /= 2;
            numberEntered %= 2;

            numberEntered ++;
            numberEntered --;
            ++numberEntered;
            --numberEntered;

            int numberABS = Math.abs(numberEntered);
            int whichIsBigger = Math.max(5,7); //7
            int whichIsMinimum = Math.min(5,7); //5
            /*
            * comment lines
            *comment lines
             */

            double numSqrt = Math.sqrt(4.78);

            int numCeiling = (int) Math.ceil(234.68);
            System.out.println(numCeiling);
            int numFloor = (int) Math.floor(234.68);
            System.out.println(numFloor);
            int numRound = (int) Math.round(234.68);
            System.out.println(numRound);

            int randomNumber = (int) (Math.random() * 10);
            System.out.println(randomNumber);



        } else {
            System.out.println("Enter a number next time");
        }
    }
}