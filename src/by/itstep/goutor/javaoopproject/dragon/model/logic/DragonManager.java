package by.itstep.goutor.javaoopproject.dragon.model.logic;

import by.itstep.goutor.javaoopproject.dragon.model.data.Dragon;

public class DragonManager {
    private static final int FIRST_PERIOD = 200;
    private static final int SECOND_PERIOD = 300;
    private static final int BORN = 3;
    private static final int FIRST_HEAD = 3;
    private static final int SECOND_HEAD = 2;

    public static int calculateDragonHead(Dragon dragon) {

        if (dragon == null) {
            return -1;
        }

        if (dragon.getAge() < 0) {
            return -2;
        }

        int head = 3;


        return head;
    }
}
