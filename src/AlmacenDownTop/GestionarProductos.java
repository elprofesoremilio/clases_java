package AlmacenDownTop;

import utils.Utils;
import java.util.Scanner;

public class GestionarProductos {
    private static Scanner sc = new Scanner(System.in);
    private static Almacen almacen = new Almacen();
    private static String textoMenu =  "---------MENÚ-----------\n" +
            "1. Listar productos\n" +
            "2. Añadir producto nuevo\n" +
            "3. Eliminar producto\n" +
            "4. Modificar producto existente\n" +
            "0. Salir\n" +
            "-----------------------------";



    private static int add() {
        System.out.println("Debe indicar los datos del nuevo producto.");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Precio: ");
        float precio = Float.parseFloat(sc.nextLine());
        System.out.println("Existencias: ");
        int existencias = Integer.parseInt(sc.nextLine());
        almacen.add(new Producto(nombre,precio,existencias));
        return 0;
    }
    private static void list() {
        if (almacen.size()<1) {
            System.out.println("No se encontraron productos.");
            return;
        }
        for (int i = 0; i < almacen.size(); i++) {
            System.out.println(almacen.get(i));
        }
    }
    private static void remove() {
        System.out.println("Introduzca el nombre del producto a eliminar: ");
        String nombre = sc.nextLine();
        Producto producto = almacen.get(nombre);
        if (producto!=null) {
            if (almacen.remove(producto)==0) {
                System.out.println("Producto eliminado correctamente");
            } else {
                System.out.println("Error al eliminar producto");
            }
        } else {
            System.out.println("El producto indicado no existe.");
        }
    }
    private static void set() {
        System.out.println("Introduzca el nombre del producto a modificar: ");
        String nombre = sc.nextLine();
        Producto producto = almacen.get(nombre);
        if (producto!=null) {
            System.out.println("Debe indicar los nuevos datos del producto.");
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Precio: ");
            float precio = Float.parseFloat(sc.nextLine());
            System.out.println("Existencias: ");
            int existencias = Integer.parseInt(sc.nextLine());
            if (almacen.set(producto,new Producto(nombre,precio,existencias))==0) {
                System.out.println("Producto modificado correctamente");
            } else {
                System.out.println("Error al modificar producto");
            }
        } else {
            System.out.println("El producto indicado no existe.");
        }
    }
    private static void waitEnter() {
        System.out.println("Pulse ENTER para continuar...");
        sc.nextLine();
    }
    public static void main(String[] args) {

        int opcion;
        do {
            opcion = Utils.getOpcionMenu(textoMenu);
            switch (opcion) {
                case 1:
                    list();
                    waitEnter();
                    break;
                case 2:
                    if (add()==0) {
                        System.out.println("Producto añadido correctamente");
                    } else {
                        System.out.println("Ocurrió algún error al añadir el producto");
                    }
                    waitEnter();
                    break;
                case 3:
                    remove();
                    waitEnter();
                    break;
                case 4:
                    set();
                    break;
                case 0:
                    System.out.println("Finalización del programa.");
                    break;
                default:
                    System.out.println("Opción no permitida.");
            }
        } while (opcion!=0);
    }
}
