package za.ac.cput.adpassignment;
/**
 * Siphosethu Manisi - 219039380
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class GymTest {

    private Gym gymMember1;
    private Gym gymMember2;
    private Gym gymMember3;

    @BeforeEach
    void setUp() {
        gymMember1 = new Gym();
        gymMember2 = new Gym();
        gymMember3 = gymMember1;
    }
    @Test
    void testIdentity(){
        assertSame(gymMember1,gymMember3);
    }
    @Test
    void testEquality(){
        assertEquals(gymMember1,gymMember3);
    }
    @Test
    void testfail(){
        fail("This will fail");
        assertNotEquals(gymMember1,gymMember2);
    }

    @Timeout(1000)
    @Test
    void TestTimeout() {
        assertEquals(gymMember1,gymMember3);
    }

    @Disabled
    @Test
    void TestDisable(){
        assertNotEquals(gymMember1,gymMember2);
    }
}