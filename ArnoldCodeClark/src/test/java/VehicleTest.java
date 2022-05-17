import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    private Vehicle vehicle;
    private Engine engine;
    private Tyres tyres;

    @Before
    public void before(){

        engine = new Engine("Honda",2000, 2);
        tyres = new Tyres("Eli's Tyres" , 2);
        vehicle = new Vehicle("Ford" , VehicleType.DIESEL , 20000);

    }

    @Test
    public void hasName(){
        assertEquals("Ford" , vehicle.getName());
    }

    @Test
    public void hasVehicleType(){
        assertEquals(VehicleType.DIESEL , vehicle.getType());
    }

    @Test
    public void vehicleHasCharging(){
        assertEquals(3 , vehicle.getType().getChargeMinutes());
    }

    @Test
    public void countVehicleComponent(){
        assertEquals(0 , vehicle.numberOfComponents());
    }

    @Test
    public void canAddComponent(){
        vehicle.addComponent(engine);
        vehicle.addComponent(tyres);
        assertEquals(2 , vehicle.numberOfComponents());
    }

    @Test
    public void checkComponents(){
        vehicle.addComponent(engine);
        vehicle.addComponent(tyres);
        assertEquals(Arrays.asList(engine, tyres) , vehicle.getComponents());
    }



}
