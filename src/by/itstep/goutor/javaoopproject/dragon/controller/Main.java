package by.itstep.goutor.javaoopproject.dragon.controller;

import by.itstep.goutor.javaoopproject.dragon.model.data.Dragon;
import by.itstep.goutor.javaoopproject.dragon.model.logic.DragonManager;
import by.itstep.goutor.javaoopproject.dragon.util.DragonHeadUI;
import by.itstep.goutor.javaoopproject.dragon.util.UserInit;
import by.itstep.goutor.javaoopproject.dragon.view.Printer;

public class Main {
    public static void main(String[] args) {

        int age = UserInit.getUserNumber();
        Dragon dragon = new Dragon("first", age);

        int head = DragonManager.calculateDragonHead(dragon);


        Printer.print(DragonHeadUI.getUserUI(dragon, head));

    }
}
