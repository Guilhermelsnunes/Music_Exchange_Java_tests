import behaviours.ISell;
import java.util.ArrayList;


public class Shop {

    private ArrayList<ISell>stock;


   //constructor

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }


    //getter
    public ArrayList<ISell> getStock() {
        return stock;
    }

    //remove all elements from the list
    public void clearStock() {
        stock.clear();
    }

    //Adds an item to the list
    public void addItem(ISell stockItem){
        stock.add(stockItem);
    }

    //removes an item from the list
    public void removeItem(ISell stockItem){
        stock.remove(stockItem);
    }

}
