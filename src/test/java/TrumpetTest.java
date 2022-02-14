import Items_management.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Wood", 100.00,200.00,3);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", trumpet.getMaterialMadeOf());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(100.00, trumpet.getBoughtPrice(),00.00);
    }

    @Test
    public void hasSoldPrice(){
        assertEquals(200.00, trumpet.getSoldPrice(),00.00);
    }

    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getValves());
    }

    @Test
    public void canPlay(){
        assertEquals("fafafa", trumpet.play("fafafa"));
    }

    @Test
    public void hasMarkup(){
        assertEquals(100.00, trumpet.markup(),00.00);
    }

}
