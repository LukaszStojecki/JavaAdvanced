package luk.sto.pl.model;

public class Bike extends Vehicle{

    @Override
    protected void acceleration(int speed) {
        System.out.println("Accelerate as a bike");

    }

    public Bike(String name) {
        super(name);
    }

    public Bike() {
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
