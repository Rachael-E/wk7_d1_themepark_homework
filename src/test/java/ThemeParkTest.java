import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {


    ThemePark themepark;
   RollerCoaster rollerCoaster;
   Playground playground;
   TobaccoShop tobaccoShop;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("RollerCoaster", 5, 4);
        playground = new Playground("PlayGround", 5, 10);
        tobaccoShop = new TobaccoShop("TobaccoShop", "Tony", 5, 1, 20);
        themepark = new ThemePark("Fun Towers");


        }


    @Test
    public void themeParkHasName(){
        assertEquals("Fun Towers", themepark.getName());
    }

    @Test
    public void themerParkAddedAttractions() {
        themepark.addAttractionOrStall(rollerCoaster);
        themepark.addAttractionOrStall(playground);
        themepark.addAttractionOrStall(tobaccoShop);
        assertEquals(3, themepark.attractionCount());
    }




    @Test
    public void themeParkReports(){
        themepark.addAttractionOrStall(rollerCoaster);
        themepark.addAttractionOrStall(playground);
        themepark.addAttractionOrStall(tobaccoShop);
        assertEquals("RollerCoaster: 5, PlayGround: 5, TobaccoShop: 1, ", themepark.report());

    }

}
