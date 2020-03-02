package eleven.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LessonEleven {

    public static void main (String[] args){
        ArrayList arrayListOne;

        arrayListOne = new ArrayList();

        ArrayList arrayList2 = new ArrayList();

        ArrayList<String> names = new ArrayList<String>();

        names.add("Miller");
        names.add("John Smith");
        names.add("Huiler Healer");
        names.add("Jack London");

        for (int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println();
        names.add(0, "Jack Deal");

        names.set(0, "John Adams");
        //names.subList(0,2).clear();

        for (int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println(names);

        for (String i: names){
            System.out.println(i);
        }

        System.out.println("---Iter");
        Iterator indivItems = names.iterator();

        while (indivItems.hasNext()){
            System.out.println(indivItems.next());
        }

        System.out.println("---Copy");
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        String paulYoung =  "Paul Young";
        names.add(paulYoung);

        System.out.println(names);

        if (names.contains(paulYoung)){
            System.out.println("Paul Young is here!");
        }

        System.out.println(nameCopy);
        if (nameCopy.containsAll(names)){
            System.out.println("Identical!");
        }
        else System.out.println("Not equal!");

        names.clear();

        if (names.isEmpty()){
            System.out.println("Empty");
        }

        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));


    }

}
