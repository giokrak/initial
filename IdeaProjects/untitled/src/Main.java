
class Car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private int doors;
    private double speed = 0;

    public Car(boolean engine, int wheels, int cylinders, int doors, double speed) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.doors = doors;
        this.speed = 0;

    }
    public void startEngine(boolean carOn){
        if (carOn){
            System.out.println("The engine is on");
        }else {
            System.out.println("The engine is off");
        }
    }


    public void accelerate(double kmPerSec){
        System.out.println("The car is accelerating with " + kmPerSec
        + " km per sec");

    }

    public void brake (double speed, double brakeRatio){
        while (speed>0){
            speed -=brakeRatio;
            System.out.println("The car is decreasing speed with  " + brakeRatio+ " pes sec and its speed is "+ speed);

        }
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }
}













public class Main {

    public static void main (String args[]){
        Car theCar = new Car(true, 4, 4, 5, 0);
        theCar.brake(150, 5);



    }
}
