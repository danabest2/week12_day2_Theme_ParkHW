package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor2;

    @Before
    public void setUp(){
        playground = new Playground("Fun Zone", 7);
        visitor2 = new Visitor(15, 1.3, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isAllowedTo(){
        assertEquals(true, playground.isAllowedTo(visitor2));
    }
}
