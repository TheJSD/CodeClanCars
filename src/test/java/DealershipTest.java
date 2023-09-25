import com.codebase.Dealership;
import com.codebase.components.DieselEngine;
import com.codebase.components.Tyres;
import com.codebase.vehicles.DieselCar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DealershipTest {
    Dealership dealership;
    DieselCar dieselCar;
    DieselEngine dieselEngine;
    Tyres tyres;
    @Before
    public void before(){
        dieselEngine = new DieselEngine( 2.0);
        tyres = new Tyres("Pirelli", "Winter", "Medium");
        dieselCar = new DieselCar(20000,"Red", dieselEngine, tyres);
        dealership = new Dealership(50000);
    }
    @Test
    public void canGetBalance() {
        assertEquals(50000, dealership.getBalance(), 0.0);
    }
    @Test
    public void stockStartsEmpty() {
        assertEquals(0, dealership.getNumberOfVehiclesInStock());
    }
    @Test
    public void canAddCarToStock() {
        dealership.addCar(dieselCar);
        assertEquals(1, dealership.getNumberOfVehiclesInStock());
    }
}
