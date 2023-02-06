import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BottleTest {
    private Bottle bottle;

    @Before
    public void setup() { bottle = new Bottle(100);}

    @Test
    public void bottleHasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void bottleCanBeDrunk() {
        bottle.sipBottle();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void bottleCanBeEmptied() {
        bottle.emptyBottle();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void bottleCanBeFilled() {
        bottle.fillBottle();
        assertEquals(100, bottle.getVolume());
    }

}
