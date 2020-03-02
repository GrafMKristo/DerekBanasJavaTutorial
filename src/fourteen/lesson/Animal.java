package fourteen.lesson;

public class Animal {
    private String name = "Animal";
    public String favFood = "Food";

    protected final void changeName(String newName){
        this.name = newName;
    }

    protected final String getName  (){
        return this.name;
    }

    public  void eatStuff(){
        System.out.println("Yum " + favFood);
    }

    public void walkAround(){
        System.out.println(this.name + " walks around");
    }

    public Animal(String name, String favFood) {
        this.name = name;
        this.favFood = favFood;
    }

    public Animal() {
    }
}
