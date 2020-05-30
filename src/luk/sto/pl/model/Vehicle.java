package luk.sto.pl.model;

public abstract class Vehicle {

    private String name;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        this.acceleration(speed);
    }

    protected abstract void acceleration(int speed);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle() {
        System.out.println("Vehicle");
    }

    public abstract void start();

    public abstract void stop();

}
