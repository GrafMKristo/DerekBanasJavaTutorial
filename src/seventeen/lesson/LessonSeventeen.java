package seventeen.lesson;

public class LessonSeventeen {

    public static void main(String[] args) {

        Thread getTime = new GetTime20();

        Runnable getMail = new GetTheMail(10);

        Runnable getMailAgain = new GetTheMail(13);

        getTime.start();

        new Thread(getMail).start();
        new Thread(getMailAgain).start();
        new Thread(getMail).start();
        new Thread(getMailAgain).start();

    }
}
