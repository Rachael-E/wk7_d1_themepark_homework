import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Dodgems dodgem;
    Playground playground;
    TobaccoShop tobaccoShop;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Rolling", 5, 10.00);
        dodgem = new Dodgems("Dodgy", 2, 8.00);
        playground = new Playground("Playful", 3, 5);
        tobaccoShop = new TobaccoShop("Lung decay", "Tarry McCougher", 12, 0, 25);
        visitor1 = new Visitor(20, 150, 100);
        visitor2 = new Visitor(10, 100, 20);
    }

    @Test
    public void rollerCoasterHasPrice(){
        assertEquals(10.00, rollerCoaster.getPrice(), 0.1);

    }

    @Test
    public void rollerCoasterFullPriceForAdult(){
        assertEquals(10.00, rollerCoaster.priceFor(visitor1), 0.1);

    }

    @Test
    public void rollerCoasterHalfPriceForChild(){
        assertEquals(5.00, rollerCoaster.priceFor(visitor2), 0.1);
    }

    @Test
    public void rollerCoasterReturnsFalseIfVisitorUnder12(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void dodgemsHalfPriceForChild(){
        assertEquals(4.00, dodgem.priceFor(visitor2), 0.1);
    }

    @Test
    public void playgroundHasPrice(){
        assertEquals(5, playground.getPrice(), 0.1);
    }

    @Test
    public void playgroundReturnsFalseIfVisitorTooOld(){
        assertEquals(false, playground.isAllowedTo(visitor1));
    }

    @Test
    public void TobaccoShopHasName(){
        assertEquals("Lung decay", tobaccoShop.getName());
    }

    @Test
    public void tobaccoShopHasPrice(){
        assertEquals(25, tobaccoShop.getPrice());
    }

    @Test
    public void tobaccoShopReturnsFalseIfVisitorTooYoung(){
        assertEquals(false, tobaccoShop.isAllowedTo(visitor2));
    }
}
