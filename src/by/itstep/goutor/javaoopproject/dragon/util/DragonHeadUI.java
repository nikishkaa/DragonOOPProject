package by.itstep.goutor.javaoopproject.dragon.util;

import by.itstep.goutor.javaoopproject.dragon.model.data.Dragon;

public class DragonHeadUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getUserUI(Dragon dragon, int head) {

        return BUILDER.append("Start Dragon\n").append(dragon)
                .append("\nDragon age ").append(dragon.getAge())
                .append("\nDragon head ").append(head);
    }
}
