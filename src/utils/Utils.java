package utils;

import java.util.Scanner;

public class Utils {
    public static final Scanner scanner = new Scanner(System.in);
    public static int getOpcionMenu(String textoMenu) {
        System.out.println(textoMenu);
        String opcion = scanner.nextLine();

        return Integer.parseInt(opcion);
    }

    public static void pulsaEnter() {
        System.out.println("Pulse ENTER para continuar...");
        scanner.nextLine();
    }
}
