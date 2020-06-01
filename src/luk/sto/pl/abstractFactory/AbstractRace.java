package luk.sto.pl.abstractFactory;

import luk.sto.pl.model.Car;
import luk.sto.pl.model.Vehicle;

public abstract class AbstractRace {

    public static AbstractRace getRace(Vehicle attendee) {

        if(attendee instanceof Car) {
            return new CarRace();
        }
        return null;

    }
    public abstract Integer getLapsNumber();

}
