import org.junit.Before;
import org.junit.Test;
import people.Customer;
import people.Dealership;
import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DealershipTest {


    private Dealership dealership;
    private Vehicle vehicle1, vehicle2, vehicle3;

    @Before
    private void before(){
        dealership = new Dealership(80000);
        vehicle1 = new Vehicle("Ford" , VehicleType.DIESEL, 20000);
        vehicle2 = new Vehicle("Honda" , VehicleType.ELECTRIC, 40000);
        vehicle3 = new Vehicle("Tesla" , VehicleType.HYBRID, 80000);
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(vehicle1);
        dealership.addVehicle(vehicle2);
        dealership.addVehicle(vehicle3);
        assertEquals(Arrays.asList(vehicle1, vehicle2, vehicle3), dealership.getVehiclesList());

    }

    @Test
    public void canBuyVehicle(){
        dealership.buyVehicle(vehicle1);
        assertEquals(60000 , dealership.getMoney());
        assertEquals(Arrays.asList(vehicle1), dealership.getVehiclesList());
    }

}
