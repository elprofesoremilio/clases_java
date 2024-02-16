package EjerciciosConClases.BibliotecaTopDown;

import Archivos.Config;
import utils.Utils;

import java.util.Scanner;

public class GestionBilioteca {
    public static void main(String[] args) {
        /* TODO: Crear el menú para gestionar las siguientes opciones
            - Crear biblioteca nueva
            - Cargar biblioteca existente desde archivo
            - Guardar biblioteca actual en archivo
            - Listar los libros de una biblioteca
            - Gestionar libros de la biblioteca (añadir, eliminar y modificar libros)
            - Salir
            Recomiendo crear el switch y empezar a programar la opción más fácil.
         */

        String textoMenu = "1. Crear biblioteca nueva\n" +
                "2. Cargar biblioteca existente desde archivo\n" +
                "3. Guardar biblioteca actual en archivo\n" +
                "4. Listar los libros de una biblioteca\n" +
                "5. Gestionar libros de la biblioteca (añadir, eliminar y modificar libros)\n" +
                "0. Salir\n";

        Scanner sc = new Scanner(System.in);
        int opcion;
        Biblioteca biblioteca = null;
        do {
            opcion = Utils.getOpcionMenu(textoMenu);
            switch (opcion) {
                case 1:
                    biblioteca = new Biblioteca();
                    System.out.println("Biblioteca creada con éxito.");
                    Utils.pulsaEnter();
                    break;
                case 2:
                    biblioteca = Biblioteca.load(Config.NOMBRE_ARCHIVO_ESCRITURA);
                    if (biblioteca!=null) {
                        System.out.println("Biblioteca cargada correctamente.");
                    } else {
                        System.out.println("Se ha encontrado algún error");
                    }
                    Utils.pulsaEnter();
                    break;
                case 3:

                    if (biblioteca.save(Config.NOMBRE_ARCHIVO_ESCRITURA)) {
                        System.out.println("Biblioteca guardada correctamente.");
                    } else {
                        System.out.println("Se ha encontrado algún error");
                    }
                    Utils.pulsaEnter();
                    break;
                case 4:
                    if (biblioteca==null) {
                        System.out.println("Biblioteca no definida.");
                    } else if (biblioteca.libros.isEmpty()) {
                        System.out.println("Biblioteca vacía");
                    } else {
                        for (Libro libro : biblioteca.libros) {
                            System.out.println(libro);
                        }
                    }
                    Utils.pulsaEnter();
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Salir del programa.");
                    break;
                default:
                    System.out.println("Opción elegida incorrecta, pruebe de nuevo.");
            }

        } while (opcion!=0);

    }
}
