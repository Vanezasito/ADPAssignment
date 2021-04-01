package za.ac.cput.adpassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    private Math mathc;
    private Math mathd;
    private Math mathe;
    private Math mathdf;

    @BeforeEach
    void setUp() {

        mathc = new Math();
        mathd = new Math();
        mathe = new Math();
        mathdf = new Math();
    }

    @Test
    void testIdentity(){
        assertSame(mathc, mathc);
    }

    @Test
    void testEquality(){
        assertEquals(mathdf, mathc);
    }

    @Test
    void testFailingTest(){
    assertEquals(mathd,mathe);
    }

    @Test
    void testTimeOut(){
        assertEquals(mathdf,mathdf);
    }

    @Test
    void testDisablingTest(){
    assertEquals(mathd, mathe);
    }
}