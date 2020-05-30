package luk.sto.pl.model;

public class Bike extends Vehicle{

    @Override
    protected boolean acceleration(int speed) {
        System.out.println("Accelerate as a bike");
        return false;
    }

    public Bike(String name) {
        super(name);
    }

    public Bike() {
    }
}
