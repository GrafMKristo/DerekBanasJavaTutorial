package fourteen.lesson;

public class LessonFourteen {

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        Cat morris = new Cat("Morris", "Mouse", "Ball");
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);

        Animal tabby = new Cat("Tobby", "Meat", "Rope");

        acceptAnimal(tabby);
        acceptAnimal(new Animal("HErcules", "Fish"));
    }

    public static void acceptAnimal(Animal randAnimal) {
        System.out.println("---------------");
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);

        randAnimal.walkAround();
        if (randAnimal instanceof Cat) {
            System.out.println(randAnimal.getName() + " plays with " + ((Cat) randAnimal).favToy);
        }else {
            System.out.println(randAnimal.getName() + " doesnt play");
        }
    }
}
