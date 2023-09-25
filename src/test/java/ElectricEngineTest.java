import com.codebase.vehicles.components.DieselEngine;
import com.codebase.vehicles.components.ElectricEngine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ElectricEngineTest {
    ElectricEngine electricEngine;
    @Before
    public void before () {
        electricEngine = new ElectricEngine(100);

    }
    @Test
    public void canGetBatteryLevel(){
        assertEquals(100, electricEngine.getCapacity(), 0.00);
    }

    @Test
    public void checkEngineisElectric(){
        assertEquals("Electric", electricEngine.getEngineType());
    }
}
