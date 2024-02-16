package Archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTextoLineaALinea {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        String linea;

        try {
            fr = new FileReader(Config.NOMBRE_ARCHIVO);
            br = new BufferedReader(fr);

            while ((linea = br.readLine())!=null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("No se pudo cerrar el buffer");
                }
            }
            if (fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("No se pudo cerrar el archivo");
                }
            }
        }


    }
}
