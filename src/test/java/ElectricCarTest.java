import com.codebase.components.ElectricMotor;
import com.codebase.components.Tyres;
import com.codebase.vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;
    ElectricMotor electricMotor;
    Tyres tyres;
    @Before
    public void before(){
        electricMotor = new ElectricMotor(100);
        tyres = new Tyres("Pirelli", "Winter", "Medium");
        electricCar = new ElectricCar(25000.00, "Blue", electricMotor, tyres);
    }
    @Test
    public void canGetPrice(){
        assertEquals(25000, electricCar.getPrice(), 0.00);
    }

    @Test
    public void canGetColour(){
        assertEquals("Blue", electricCar.getColour());
    }
    @Test
    public void canGetElectricMotor() {assertEquals(electricMotor, electricCar.getElectricMotor());}
    @Test
    public void canGetTyres(){
        assertEquals(tyres, electricCar.getTyres());
    }

}
