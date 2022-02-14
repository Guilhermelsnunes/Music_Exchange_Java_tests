import Items_management.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("timber", 500.00, 1000.00,88);
    }

    @Test
    public void hasMaterial(){
        assertEquals("timber", piano.getMaterialMadeOf());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(500.00, piano.getBoughtPrice(),00.00);
    }

    @Test
    public void hasSoldPrice(){
        assertEquals(1000.00, piano.getSoldPrice(),00.00);
    }

    @Test
    public void hasKeys(){
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("do re mi fa sol la si do", piano.play("do re mi fa sol la si do"));
    }

    @Test
    public void hasMarkup(){
        assertEquals(500.00, piano.markup(), 00.00);
    }

}
