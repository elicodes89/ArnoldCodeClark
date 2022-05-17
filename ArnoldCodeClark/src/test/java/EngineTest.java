import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before(){

        engine = new Engine("Honda",2000, 2);
    }

    @Test
    public void hasPower(){
        assertEquals(2000, engine.getPower());

    }

    @Test
    public void hasLitres(){
        assertEquals(2 , engine.getLitres());
    }
}
