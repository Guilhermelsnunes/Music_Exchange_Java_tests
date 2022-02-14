import Items_management.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(7.00, 10.00);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(7.00, sheetMusic.getBoughtPrice(),00.00);
    }

    @Test
    public void hasSoldPrice(){
        assertEquals(10.00, sheetMusic.getSoldPrice(),00.00);
    }

    @Test
    public void hasMarkup(){
        assertEquals(3, sheetMusic.markup(),00.00);
    }

}
