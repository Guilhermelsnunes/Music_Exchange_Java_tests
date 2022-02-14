package Items_management;

import behaviours.ISell;

public class SheetMusic implements ISell {

    private double boughtPrice;
    private double soldPrice;

    public SheetMusic(double boughtPrice, double soldPrice) {
        this.boughtPrice = boughtPrice;
        this.soldPrice = soldPrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    @Override
    public double markup() {
        return getSoldPrice() - getBoughtPrice();
    }
}
