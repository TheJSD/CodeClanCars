import com.codebase.components.ElectricMotor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ElectricMotorTest {
    ElectricMotor electricMotor;
    @Before
    public void before () {
        electricMotor = new ElectricMotor(100);

    }
    @Test
    public void canGetBatteryLevel(){
        assertEquals(100, electricMotor.getCharge(), 0.00);
    }
}
