import Items_management.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("resin",200.00, 300.00,6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("resin", guitar.getMaterialMadeOf());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(200.00, guitar.getBoughtPrice(),00.00);
    }

    @Test
    public void hasSoldPrice(){
        assertEquals(300.00, guitar.getSoldPrice(),00.00);
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("blenblen", guitar.play("blenblen"));
    }

    @Test
    public void hasMarkup(){
        assertEquals(100.00, guitar.markup(),00.00);
    }
}
