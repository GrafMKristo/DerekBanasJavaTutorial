package sixteen.lesson;

import fifteen.lesson.Vehicle;

import java.util.Arrays;

public class LessonSixteen {

    public static void  main(String[] args){
        Object superCar = new Vehicle();

        System.out.println(((Vehicle)superCar).getSpeed());

        Vehicle superTruck = new Vehicle();
        System.out.println(superCar.equals(superTruck));
        Object someCar = superCar;
        System.out.println(superCar.equals(someCar));

        System.out.println(superCar.hashCode());
        System.out.println(superCar.getClass());
        System.out.println(superCar.getClass().getName());

        if (superCar.getClass() == superTruck.getClass()) System.out.println("the same");

        System.out.println(Arrays.toString(superCar.getClass().getInterfaces()));

        System.out.println(superCar);

        superTruck.setWheels(8);;

        Vehicle superTruck2 = superTruck.clone();
        System.out.println(superTruck.getWheel());
        System.out.println(superTruck2.getWheel());

        System.out.println(superTruck.hashCode());
        System.out.println(superTruck2.hashCode());


    }

}
