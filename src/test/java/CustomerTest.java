import com.codebase.vehicles.components.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    @Before
    public void before (){
        customer = new Customer(50000);
    }
    @Test
    public void ownedVehiclesStartsEmpty(){
        assertEquals(1, customer.numberOfOwnedVehicles());
    }
    @Test
    public void canGetBalance(){
        assertEquals(50001,customer.getBalance());
    }
}
