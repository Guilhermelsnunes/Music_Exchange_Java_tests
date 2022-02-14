package Items_management;

import behaviours.IPlay;
import behaviours.ISell;


public class Piano extends Instrument implements IPlay, ISell {

    private int keys;

    public Piano(String materialMadeOf, double boughtPrice, double soldPrice, int keys) {
        super(materialMadeOf, boughtPrice, soldPrice);
        this.keys = keys;
    }


    public int getKeys() {
        return keys;
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
