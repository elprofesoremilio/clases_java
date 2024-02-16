package Archivos;

import java.io.File;

public class OperacionesDirectorios {
    public static void main(String[] args) {
        File file = new File(Config.NOMBRE_CARPETA);

        if (!file.isDirectory()) {
            System.out.println("EL archivo proporcionado no es una carpeta.");
            System.exit(0);
        }

        for (File f : file.listFiles()) {
            System.out.println(f.getName());
        }

    }
}
