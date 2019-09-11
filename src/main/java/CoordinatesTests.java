import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoordinatesTests
{
    private CoordinatesParser coordinatesParser;

    @Before
    public void setUp(){
        coordinatesParser = new CoordinatesParser();
    }

    @Test
    public void createCoordinatesWithLambdaExpression() {
        Coordinates coordinates = coordinatesParser.parse("1,2", (x, y) -> new Coordinates(x, y));
        Assert.assertEquals(coordinates.getX(), new Integer(1));
        Assert.assertEquals(coordinates.getY(), new Integer(2));
    }

    @Test
    public void createCoordinatesWithConstructorReference() {
        Coordinates coordinates = coordinatesParser.parse("3,4", Coordinates::new);
        Assert.assertEquals(coordinates.getX(), new Integer(3));
        Assert.assertEquals(coordinates.getY(), new Integer(4));
    }

    @Test
    public void createCoordinatesWithInstanceMethodReference() {
        Factory factory = new Factory();
        Coordinates coordinates = coordinatesParser.parse("5,6", factory::createCoordinates);
        Assert.assertEquals(coordinates.getX(), new Integer(5));
        Assert.assertEquals(coordinates.getY(), new Integer(6));
    }

    @Test
    public void createCoordinatesWithStaticMethodReference() {
        Coordinates coordinates = coordinatesParser.parse("7,8", Factory::createsCoordinates);
        Assert.assertEquals(coordinates.getX(), new Integer(7));
        Assert.assertEquals(coordinates.getY(), new Integer(8));
    }
}
