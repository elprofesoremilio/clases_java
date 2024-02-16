package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivoScanner {
    public static void main(String[] args) {
        Scanner file = null;
        try {
            file = new Scanner(new File(Config.NOMBRE_ARCHIVO));
            String linea;

            while (file.hasNextLine()) {
                linea = file.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (file!=null) file.close();
        }

    }
}
