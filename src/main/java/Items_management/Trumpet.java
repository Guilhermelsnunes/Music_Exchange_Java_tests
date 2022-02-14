package Items_management;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int valves;

    public Trumpet(String materialMadeOf, double boughtPrice, double soldPrice, int valves) {
        super(materialMadeOf, boughtPrice, soldPrice);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    @Override
    public String play(String sound) {
        return sound;
    }

    @Override
    public double markup() {
        return getSoldPrice() - getBoughtPrice();
    }
}
