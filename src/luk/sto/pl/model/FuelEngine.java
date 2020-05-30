package luk.sto.pl.model;

public class FuelEngine extends Engine {


    @Override
    protected void working(Integer power) {
        if (power == 0) {
            System.out.println("Engine is not working: " + power);
        } else {
            System.out.println("Engine is working: " + power);
        }
    }
}
