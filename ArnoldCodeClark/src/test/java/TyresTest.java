import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {
    private Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Eli's Tyres", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Eli's Tyres", tyres.getName());
    }

    @Test
    public void hasTread(){
        assertEquals(2, tyres.getTread());
    }
}
