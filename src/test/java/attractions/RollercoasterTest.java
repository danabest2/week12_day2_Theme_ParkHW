package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(13, 1.5, 45 );
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTo(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }
}
