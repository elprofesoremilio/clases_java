package BibliotecaTopDown;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //TODO: declarar variables necesarias
        String textoMenu = "---------MENÚ-----------\n" +
                "1. Listar libros\n" +
                "2. Añadir libro nuevo\n" +
                "3. Eliminar libro\n" +
                "4. Modificar libro existente\n" +
                "0. Salir\n" +
                "-----------------------------";
        int opcion;
        Biblioteca biblioteca = new Biblioteca();

        do {
            System.out.println(textoMenu);
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    verListadoLibros(biblioteca);
                    break;
                case 2:
                    addLibro(biblioteca);
                    break;
                case 3:
                    removeLibro(biblioteca);
                    break;
                case 4:
                    modificarLibro(biblioteca);
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no permitida, pruebe otra vez.");
            }

        } while (opcion!=0);
    }

    private static void modificarLibro(Biblioteca biblioteca) {
        System.out.println("Introduzca el libro a modificar: ");
        String titulo = sc.nextLine();
        if (biblioteca.contains(titulo)) {
            System.out.println("Introduzca el nuevo título: ");
            if (biblioteca.update(titulo, sc.nextLine())) {
                System.out.println("Libro modificado correctamente");
            } else {
                System.out.println("Ha sucedido un error");
            }
        } else {
            System.out.println("No existe ese libro");
        }
    }

    private static void removeLibro(Biblioteca biblioteca) {
        System.out.println("Introduzca el título del libro a eliminar: ");
        if (biblioteca.remove(sc.nextLine())) {
            System.out.println("Libro borrado correctamente");
        } else {
            System.out.println("No existía ese libro. Compruebe el título.");
        }
    }

    private static void addLibro(Biblioteca biblioteca) {
        System.out.println("Introduzca el título del nuevo libro: ");
        String titulo = sc.nextLine();
        if (biblioteca.addLibro(titulo)) {
            System.out.println("Libro añadido correctamente.");
        }
    }

    private static void verListadoLibros(Biblioteca biblioteca) {
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println("Libro: " + biblioteca.getTituloLibro(i));
        }
    }
}
