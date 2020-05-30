package luk.sto.pl.model;

public class Car extends Vehicle {

    private Engine engine = new FuelEngine();

    @Override
    protected void acceleration(int speed) {
        engine.setSpeed(speed);
        //System.out.println("Accelerate as a Car");

    }

    public Car(String name) {
        super(name);
    }

    public Car() {

    }

    @Override
    public void start() {
        engine.start();

    }

    @Override
    public void stop() {
        engine.stop();

    }

}
