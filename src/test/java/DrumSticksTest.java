import Items_management.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(5.00,8.00);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(5.00, drumSticks.getBoughtPrice(),00.00);
    }

    @Test
    public void hasSoldPrice(){
        assertEquals(8.00, drumSticks.getSoldPrice(),00.00);
    }

    @Test
    public void hasMarkup(){
        assertEquals(3.00, drumSticks.markup(),00.00);
    }
}
