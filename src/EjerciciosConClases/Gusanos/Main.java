package EjerciciosConClases.Gusanos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cuerpo = sc.nextLine();

        Gusano gusano = new Gusano(cuerpo);
        System.out.println(gusano);

        gusano.duplicar(3);
        System.out.println(gusano);
    }
}
