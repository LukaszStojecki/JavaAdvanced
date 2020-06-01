package luk.sto.pl.model;

import luk.sto.pl.exception.NotStartedEngineException;
import luk.sto.pl.strategy.CarTypeStrategy;

public class Car extends Vehicle {

    private Engine engine = new FuelEngine();

    private CarTypeStrategy typeStrategy;

    @Override
    protected void accelerate(int speed) throws NotStartedEngineException {
        if(started) {
            engine.setSpeed(speed);
        } else {
            throw new NotStartedEngineException("Acceleration of stopped engine");
        }


    }

    @Override
    public void start() {
        started = true;
        engine.start();
    }

    @Override
    public void stop() {
        started = false;
        engine.stop();
    }

    public void setTypeStrategy(CarTypeStrategy typeStrategy){
        this.typeStrategy = typeStrategy;
    }

    public String getType() {
        return this.typeStrategy.getType();
    }

    public Car() {
    }

    public Car(String name) {
        super(name);
    }
}
