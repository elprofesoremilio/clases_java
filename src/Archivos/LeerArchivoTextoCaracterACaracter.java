package Archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTextoCaracterACaracter {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader(Constants.NOMBRE_ARCHIVO);

            int caracter = fr.read();

            while (caracter!=-1) {
                System.out.print((char)caracter);
                caracter = fr.read();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer archivo.");
        } finally {
            if (fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo.");
                }
            }
        }

    }
}
