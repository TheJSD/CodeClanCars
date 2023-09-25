import com.codebase.Customer;
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
        assertEquals(0, customer.getNumberOfOwnedVehicles());
    }
    @Test
    public void canGetBalance(){
        assertEquals(50000,customer.getBalance(), 0.0);
    }
}
