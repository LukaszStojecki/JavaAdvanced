package luk.sto.pl;

import luk.sto.pl.factory.AbstractRace;
import luk.sto.pl.model.Car;
import luk.sto.pl.model.Vehicle;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Start");
        Vehicle vehicle = new Car();

        String name = vehicle.getName();

        Integer speed = vehicle.getSpeed();

        vehicle.setSpeed(10);

        AbstractRace race = AbstractRace.getRace(vehicle);

        System.out.println(race.getLapsNumber());

        Vehicle v1 = new Vehicle() {
            @Override
            protected void accelerate(int speed) {

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
