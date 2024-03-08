package by.itstep.goutor.javaoopproject.dragon.model.logic;

import by.itstep.goutor.javaoopproject.dragon.model.data.Dragon;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonManagerTest {

    public static Dragon dragon;

    @Before
    public void init() {
        dragon = new Dragon();
        dragon.setName("1");
    }

    @After
    public void zeroDragon() {
        dragon = null;
    }


    @Test
    public void bornHead() {
        dragon.setAge(0);

        int expected = 3;

        int actual = DragonManager.calculateDragonHead(dragon);

        assertEquals(expected, actual);
    }

    @Test
    public void invalidAge() {
        dragon.setAge(-10);

        int expected = -2;

        int actual = DragonManager.calculateDragonHead(dragon);

        assertEquals(expected, actual);
    }

    @Test
    public void firstPeriodHead() {
        dragon.setAge(100);

        int expected = 303;

        int actual = DragonManager.calculateDragonHead(dragon);
        assertEquals(expected, actual);
    }

    @Test
    public void nullDragon() {
        dragon = null;

        int expected = -1;

        int actual = DragonManager.calculateDragonHead(dragon);

        assertEquals(expected, actual);
    }

    @Test
    public void dragon200yearsHead() {
        dragon.setAge(200);

        int expected = 603;

        int actual = DragonManager.calculateDragonHead(dragon);

        assertEquals(expected, actual);

    }

    @Test
    public void secondPeriodHead() {
        dragon.setAge(250);

        int expected = 703;

        int actual = DragonManager.calculateDragonHead(dragon);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountHead300Years() {
        dragon.setAge(300);
        int expected = 803;

        int actual = DragonManager.calculateDragonHead(dragon);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountThirdPeriodHead() {
        dragon.setAge(350);
        int expected = 853;

        int actual = DragonManager.calculateDragonHead(dragon);

        assertEquals(expected, actual);
    }



}
