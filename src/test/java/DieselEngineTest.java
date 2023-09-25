import com.codebase.components.DieselEngine;
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
    public void canGetFuelLevel(){
        assertEquals(2.0, dieselEngine.getFuelLevel(), 0.00);
    }
}
