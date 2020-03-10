package twelve.lesson;

import java.util.Arrays;
import java.util.LinkedList;

public class LessonTwelve {

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("Ahmed Bennan");
        names.add("Said Huinya");

        names.addLast("Nathan Mark");
        names.addFirst("Joshua Julian");
        names.add(2, "Peters Giant");
        names.set(1, "Peters Giant");
        names.remove(1);
        //names.remove("Nathan Mark");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-----Retrieve");
        System.out.println("First index: " + names.get(0));
        System.out.println("Last index: " + names.getLast());

        LinkedList<String> copyNames = new LinkedList<String>(names);
        System.out.println(copyNames);

        if (names.contains("Nathan Mark")) {
            System.out.println("Here!");
        }

        if (names.containsAll(copyNames)) {
            System.out.println("True");
        }

        System.out.println("Nathan is at index " + names.indexOf("Nathan Mark"));
        names.clear();
        System.out.println("List is " + (names.isEmpty() ? "empty" : "not empty"));

        System.out.println("How many:" + names.size() );

        System.out.println("Look withou error: " + names.peek());

        System.out.println("Remove first element: " + copyNames.poll());
        System.out.println(copyNames);

        System.out.println("Remove first element: " + copyNames.pollLast());
        System.out.println(copyNames);

        copyNames.push("Ali Baba");

        for (String name: copyNames){
            System.out.println(name);
        }

        Object[] nameArray = new Object[4];
        nameArray = copyNames.toArray();

        System.out.println(Arrays.toString(nameArray));
    }

}
