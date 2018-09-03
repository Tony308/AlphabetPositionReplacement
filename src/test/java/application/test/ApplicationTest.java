package application.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Before
    public void setup() {

    }
    @After
    public void tearDown() {

    }

    @Test
    public void testApplication() {

        String testValue = "Hello World!";
        assertEquals("",replaceLetterWithIndex(testValue));
    }
}
