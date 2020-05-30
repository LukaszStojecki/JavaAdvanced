package luk.sto.pl;

import luk.sto.pl.model.Bike;
import luk.sto.pl.model.Car;
import luk.sto.pl.model.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        //vehicle = new Bike();

        //vehicle.setName("nazwa");
        String name = vehicle.getName();

        Integer speed = vehicle.getSpeed();

        vehicle.setSpeed(10);

        //System.out.println(speed);
       // System.out.println(name);

    }
}
