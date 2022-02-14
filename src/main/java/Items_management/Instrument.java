package Items_management;

public abstract class Instrument {

    private String materialMadeOf;
    private double boughtPrice;
    private double soldPrice;

    public Instrument(String materialMadeOf, double boughtPrice, double soldPrice) {
        this.materialMadeOf = materialMadeOf;
        this.boughtPrice = boughtPrice;
        this.soldPrice = soldPrice;
    }

    public String getMaterialMadeOf() {
        return materialMadeOf;
    }

    public void setMaterialMadeOf(String materialMadeOf) {
        this.materialMadeOf = materialMadeOf;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }
}
