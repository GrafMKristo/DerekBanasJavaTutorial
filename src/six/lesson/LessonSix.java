package six.lesson;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class LessonSix {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

        try {
            getAFile("./somestuff.txt");
        }
        catch(IOException e){
            System.out.println("An IO Error Occured!");
        }

/*
        System.out.print("How old are you? ");
        int age = checkValidAge();

        if (age!=0){
            System.out.println("You are " + age + "years old");
        }
*/

    }

    public static void getAFile(String fileName) throws IOException, FileNotFoundException{

            FileInputStream file = new FileInputStream(fileName);

    }


/*    private static int checkValidAge() {
        try {
            return userInput.nextInt();
        }
        catch (InputMismatchException e){
            userInput.next();
            System.out.println("Incorrect input!");
            return 0;
        }
    }*/

}
