package AlmacenDownTop;

import utils.Utils;

public class GestionarExistencias {
    private static final Almacen almacen = new Almacen();
    private static final String textoMenu =
            "---------------------MENÚ--------------------\n" +
            "1. Listar productos con existencias al límite\n" +
            "2. Añadir existencias\n" +
            "3. Eliminar existencias\n" +
            "0. Salir\n" +
            "---------------------------------------------\n";
    private static Producto add() {
        System.out.println("Debe indicar los datos del nuevo producto.");
        System.out.println("Nombre: ");
        String nombre = Utils.scanner.nextLine();
        System.out.println("Precio: ");
        float precio = Float.parseFloat(Utils.scanner.nextLine());
        Producto producto = new Producto(nombre,precio,0);
        almacen.add(producto);
        return producto;
    }
    public static void main(String[] args) {
        int opcion;
        almacen.productos.add(new Producto("Patata bolsa 5kg",1.2f,10));
        almacen.productos.add(new Producto("Pan 1kg",4f,30));
        almacen.productos.add(new Producto("Agua mineral 2L",0.7f,50));
        almacen.productos.add(new Producto("Cangrejo",10.2f,5));
        do {
            opcion = Utils.getOpcionMenu(textoMenu);

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el límite de existencias (0 para listar todos): ");
                    int limite = Integer.parseInt(Utils.scanner.nextLine());
                    for (Producto producto : almacen.productos) {
                        if (producto.getExistencias()<=limite || limite<=10) {
                            System.out.println(producto);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el nombre del producto");
                    String nombre = Utils.scanner.nextLine();
                    Producto seleccionado = almacen.get(nombre);
                    if (seleccionado!=null) {
                        System.out.println("Introduzca la cantidad a añadir: ");
                        int cantidad = Integer.parseInt(Utils.scanner.nextLine());
                        seleccionado.addExistencias(cantidad);
                    } else {
                        System.out.println("El producto no existe. ¿Quiere crearlo (S/N)?");
                        char respuesta = Utils.scanner.nextLine().charAt(0);
                        switch (respuesta) {
                            case 'S':
                            case 's':
                                Producto nuevo = add();
                                System.out.println("Introduzca la cantidad a añadir: ");
                                int cantidad = Integer.parseInt(Utils.scanner.nextLine());
                                nuevo.addExistencias(cantidad);
                                break;
                            case 'N':
                            case 'n':
                                System.out.println("Pruebe con un producto que exista.");
                                break;
                            default:
                                System.out.println("Opción no válida. No se añadirá.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar este programa.");
                    break;
                default:
                    System.out.println("Opción no disponible.");
            }

        } while (opcion!=0);

    }
}
