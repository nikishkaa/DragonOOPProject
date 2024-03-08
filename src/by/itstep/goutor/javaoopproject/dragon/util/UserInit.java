package by.itstep.goutor.javaoopproject.dragon.util;

import java.util.Scanner;

public class UserInit {
    public static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getUserNumber() {

        return SCANNER.nextInt();
    }
}
