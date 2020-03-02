package fifteen.lesson;


public class Vehicle extends Crashable implements Drivable, Cloneable {

    int numWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;

    public int getWheel() {
        return this.numWheels;
    }

    @Override
    public void setWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public double getSpeed() {
        return this.theSpeed;
    }

    @Override
    public void setSpeed(double speed) {
        this.theSpeed = speed;
    }

    public Vehicle() {
        this.theSpeed = 120.00;
        this.numWheels = 4;
    }

    public Vehicle(int wheels, double speed) {
        this.theSpeed = speed;
        this.numWheels = wheels;
    }

    @Override
    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }

    @Override
    public int getCarStrength() {
        return this.carStrength;
    }

    public String toString() {
        return "Num of wheels: " + numWheels;
    }

    public Vehicle clone(){
        Vehicle car;
        try{
            car = (Vehicle) super.clone();
        }
        catch(CloneNotSupportedException e){
            return null;
        }
        return car;
    }
}
