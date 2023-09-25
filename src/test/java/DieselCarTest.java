import com.codebase.vehicles.DieselCar;
import com.codebase.components.DieselEngine;
import com.codebase.components.Tyres;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DieselCarTest {
    DieselCar dieselCar;
    Tyres tyres;
    DieselEngine dieselEngine;
    @Before
    public void before(){
        dieselEngine = new DieselEngine( 2.0);
        tyres = new Tyres("Pirelli", "Winter", "Medium");
        dieselCar = new DieselCar(20000,"Red", dieselEngine, tyres);
    }
    @Test
    public void canGetPrice(){
        assertEquals(20000, dieselCar.getPrice(), 0.00);
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", dieselCar.getColour());
    }
    @Test
    public void canGetEngineType(){
        assertEquals("Diesel", dieselCar.getEngineType());
    }
    @Test
    public void canGetTyres(){
        assertEquals(tyres, dieselCar.getTyres());
    }

}
