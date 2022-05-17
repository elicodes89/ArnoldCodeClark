import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Vehicle vehicle1, vehicle2, vehicle3;

    @Before
    private void before(){
        customer = new Customer(100000);
        vehicle1 = new Vehicle("Ford" , VehicleType.DIESEL , 20000);
        vehicle2 = new Vehicle("Honda" , VehicleType.ELECTRIC, 40000);
        vehicle3 = new Vehicle("Tesla" , VehicleType.HYBRID, 80000);
    }

    @Test
    public void canAddVehicle(){
        customer.addVehicle(vehicle1);
        customer.addVehicle(vehicle2);
        customer.addVehicle(vehicle3);
        assertEquals(Arrays.asList(vehicle1, vehicle2, vehicle3), customer.getVehiclesList());

    }

    @Test
    public void canBuyVehicle(){
        customer.buyVehicle(vehicle1);
        assertEquals(80000 , customer.getMoney());
        assertEquals(Arrays.asList(vehicle1), customer.getVehiclesList());
    }
}
