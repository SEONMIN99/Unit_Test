

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RobotTest
{
    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void CheckSpeed()
    {
        Robot robot1 = new Robot();
        robot1.Robotwalk("녹색", 20);
        assertEquals(20.0, robot1.getSpeed(), 0.0);
        robot1.Robotwalk("노란색", 20);
        assertEquals(24.0, robot1.getSpeed(), 0.0);
        robot1.Robotwalk("빨간색", 20);
        assertEquals(0.0, robot1.getSpeed(), 0.0);
    }
}

