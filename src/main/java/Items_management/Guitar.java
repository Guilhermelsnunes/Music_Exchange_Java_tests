package Items_management;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int strings;

    public Guitar(String materialMadeOf, double boughtPrice, double soldPrice, int strings) {
        super(materialMadeOf, boughtPrice, soldPrice);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
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
