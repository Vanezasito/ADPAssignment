//Ra'ees Manuel 219074089

package za.ac.cput.adpassignment;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CarTest
{
    //Testing equality
    @Test
    void testCar(){
        Car car1 = new Car("midnight purple",02);
        Car car2 = new Car("midnight purple",02);
        assertEquals(car1,car2);
    }

    //Identity Testing
    @Test
    void testGetAge() {

        Car car = new Car("midnight purple", 02);
        assertSame(car.getModel(),02);
    }

    //FailingTest
    @Test
    void testFailingCar(){

        Car car1 = new Car("purple",02);
        Car car2 = new Car("midnight purple",02);
        assertNotEquals(car1,car2);
    }

    //Testing the timeouts
    @Test
    void testTimeoutCar(){
        assertTimeout(Duration.ofSeconds(1),()->{
            Car car1 = new Car("purple",02);
            Car car2 = new Car("midnight purple",02);
        });
    }

    //Disabling the test
    @Disabled("Disabled for Disable test!")
    @Test
    void testDisabledCar(){

        Car car1 = new Car("midnight purple",02);
        Car car2 = new Car("midnight purple",02);
        assertEquals(car1,car2);
    }
}