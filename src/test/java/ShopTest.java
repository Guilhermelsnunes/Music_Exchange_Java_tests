import Items_management.Guitar;
import Items_management.Piano;
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop();
    }

    @Test
    public void testClearStock(){
        shop.clearStock();
        assertEquals( 0, shop.getStock().size());
    }

    @Test
    public void testAddItem(){
        shop.clearStock();
        Piano piano = new Piano("timber", 500.00, 1000.00, 88);
        shop.addItem(piano);
        assertEquals( 1, shop.getStock().size());
    }

    @Test
    public void testRemoveFirstItem(){
        shop.clearStock();

        Piano piano = new Piano("timber", 500.00, 1000.00, 88);
        shop.addItem(piano);
        Guitar guitar = new Guitar("resin",200.00, 300.00,6);
        shop.addItem(guitar);

        shop.removeItem(piano);
        assertEquals( 1, shop.getStock().size());
    }
}
