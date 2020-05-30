package luk.sto.pl;

import luk.sto.pl.factory.AbstractRace;
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

        AbstractRace race = AbstractRace.getRace(vehicle);
        System.out.println(race.getLapsNumber());

        Vehicle v1 = new Vehicle() {//klasa anonimowa
            @Override
            protected void acceleration(int speed) {

            }

            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };

    }
}
