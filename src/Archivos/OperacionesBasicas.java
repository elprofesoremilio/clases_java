package Archivos;

import utils.Utils;

import java.io.File;
import java.io.IOException;

public class OperacionesBasicas {
    public static void main(String[] args) {
        File file = new File(Config.NOMBRE_ARCHIVO);

        if (file.exists()) {
            System.out.println("Archivo encontrado");
        } else {
            System.out.println("No existe, ¿quiere crearlo (S/N)?");
            char respuesta = Utils.scanner.nextLine().charAt(0);
            if (Character.toLowerCase(respuesta)=='s') {
                try {
                    if (file.createNewFile()) {
                        System.out.println("Archivo creado con éxito");
                    }
                } catch (IOException exception) {
                    System.out.println("No se ha podido crear el archivo");
                }
            } else {
                System.out.println("Has decidido no crearlo.");
            }
        }

        System.out.println("Es directorio: " + file.isDirectory());
        System.out.println("Está oculto: " + file.isHidden());
        System.out.println("Es ejecutable: " + file.canExecute());
        System.out.println("Es legible: " + file.canRead());
        System.out.println("Es escribible: " + file.canWrite());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.lastModified());
        System.out.println(file.length());
    }
}
