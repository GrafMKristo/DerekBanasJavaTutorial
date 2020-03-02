package fifteen.lesson;

public class LessonFifteen {

    public static void main(String[] args){

        Vehicle car = new Vehicle(4, 100.00);
        System.out.println("Cars maxSpeed = " + car.getSpeed());
        System.out.println("Cars wheels number = " + car.getWheel());

        car.setCarStrength(10);;
        System.out.println("Strength: " + car.getCarStrength());
    }

}
