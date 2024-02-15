package EjerciciosConClases.AlmacenDownTop;

import Archivos.Constants;

import java.util.Scanner;

public class GestAlm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Almacen almacen = null;

        String menu_principal = "1. Crear nuevo almacén\n" +
                "2. Cargar almacén\n" +
                "3. Guardar almacén actual\n" +
                "4. Gestionar productos\n" +
                "5. Gestionar existencias\n" +
                "0. Salir";

        String opcion;

        do {
            System.out.println(menu_principal);
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    almacen = new Almacen();
                    break;
                case "2":
                    almacen = GestionCSV.cargarAlmacen(Constants.NOMBRE_ARCHIVO_ESCRITURA);
                    break;
                case "3":
                    if (GestionCSV.escribirAlmacen(Constants.NOMBRE_ARCHIVO_ESCRITURA,almacen)) {
                        System.out.println("Almacén guardado.");
                    } else {
                        System.out.println("Imposible guardar almacén inexistente.");
                    }
                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "0":
                    break;
                default:
            }
            System.out.println("Pulse ENTER para continuar...");
            sc.nextLine();
        } while (!opcion.equals("0"));
    }
}
