package luk.sto.pl.model;

public class Car extends Vehicle{

    @Override
    protected boolean acceleration(int speed) {
        System.out.println("Acceleration as a Car");
        return false;
    }

    public Car(String name){
        super(name);
    }
    public  Car(){

    }

}
