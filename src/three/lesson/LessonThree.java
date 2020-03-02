package three.lesson;

public class LessonThree {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 50);

        if (randomNumber < 25) {
            System.out.println("The randomNumber is less than 25");
        } else if (randomNumber > 40) {
            System.out.println("The randomNumber is bigger than 40");
        } else if (randomNumber == 18) {
            System.out.println("The randomNumber is 18");
        } else if (randomNumber != 40) {
            System.out.println("The randomNumber is not 40");
        } else {
            System.out.println("Nothing worked");
        }
        System.out.println("The random number is " + randomNumber);

        if (!(false)) {
            System.out.println("\nI turned false into true");
        }

        if ((false) ^ (true)) {
            System.out.println("One are true");
        }

        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;

        System.out.println(biggestValue + " is the biggest");

        char theGrade = 'a';

        switch (theGrade) {
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            case 'B':
                System.out.println("Good");
                break;
            default:
                System.out.println("Baaaad!");

        }
    }
}
