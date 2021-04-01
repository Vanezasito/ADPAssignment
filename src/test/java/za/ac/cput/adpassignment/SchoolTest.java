package za.ac.cput.adpassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {


    private School  school1;
    private School   school2;
    private School   school3;
    private School   school4;
    private School   school5;

    @BeforeEach
    void setUp() {
        school1= new School();
        school2= new School();
        
        school3= new School();
        school4= new School();
        school5= new School();

    }


    @Test
    void testIdentity(){assertSame(school1, school1);

    }

    @Test
    void testEquality(){
    assertEquals(school1,school4);
    }

    @Test
    void testFailingTest() {
        assertSame(school2,school5);
    }

    @Test
    void testTimeOut(){
        assertSame(school1,school5);
    }

    @Test
    void testDisablingTest(){
        assertSame(school2,school5);

    }
}