package za.ac.cput.adpassignment;
/**
 * Na'eem Mahoney - 218190751
 *
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    private Subject subject1, subject2, subject3;

    @BeforeEach
    public void setUp() {
        subject1 = new Subject();
        subject2 = new Subject();
        subject3 = new Subject();
        subject1 = subject2;
    }

    //1. Object Equality
    //Checks if given objects are equal

    //This test will pass
    @Test
    void testSubjectEquality1(){
        assertEquals(subject1, subject2);
    }

    //This test will fail
    @Test
    void testSubjectEquaility2(){
        assertEquals(subject1, subject3);
    }

    //Testing if two objects are not Equal
    @Test
    void testSubjectNotEqual(){
        assertNotEquals(subject1, subject3);
    }

    //2. Object Identity
    //Checks if given objects are the same

    //This test will pass
    @Test
    void testSubjectIdentity1(){
        assertSame(subject1, subject2);
    }

    //This test will fail
    @Test
    void testSubjectIdentity2(){
        assertSame(subject1, subject3);
    }

    //Testing if two objects are not the same
    @Test
    void testSubjectIdentity3(){
        assertNotSame(subject1, subject3);
    }

    //3. Failing Test
    //Making a test fail on purpose
    @Test
    void failTest(){
        fail("The test has failed");
    }

    //4. Timeouts
    //Timout provides a value which represents the maximum time a test can take to run
    @Test
    @Timeout(10000)
    void testTimeout() throws InterruptedException{
        Thread.sleep(10000);
        assertSame(subject1, subject2);
    }

    //5. Disabling Tests
    //Disable a test method
    @Disabled
    @Test
    void disabledTest(){
        assertSame(subject1, subject2);
    }
}