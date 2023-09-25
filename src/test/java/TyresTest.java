import com.codebase.vehicles.components.Tyres;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TyresTest {
    Tyres tyres;
    @Before
    public void before (){
        tyres = new Tyres("Pirelli", "Winter", "Medium");

    }
    @Test
    public void canGetBrand(){
        assertEquals("Pirelli", tyres.getBrand());
    }
    @Test
    public void canGetSeason(){
        assertEquals("Winter",tyres.getSeason());
    }
    @Test
    public void canGetSize(){
        assertEquals("Medium", tyres.getSize());
    }
}
