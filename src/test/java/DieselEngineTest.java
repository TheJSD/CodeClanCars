import com.codebase.vehicles.components.DieselEngine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DieselEngineTest {
    DieselEngine dieselEngine;
    @Before
    public void before (){
        dieselEngine = new DieselEngine( 2.0);
    }
    @Test
    public void checkEngineIsDiesel (){
        assertEquals("Diesel", dieselEngine.getEngineType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2.0, dieselEngine.getCapacity(), 0.00);
    }
}
