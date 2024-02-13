package EjerciciosConClases.AlmacenDownTop;

import Archivos.Constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerDeArchivo {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(Constants.NOMBRE_ARCHIVO_ESCRITURA);
            br = new BufferedReader(fr);

            String linea;
            ArrayList<String> lineasCSV = new ArrayList<>();

            while ((linea = br.readLine())!= null) {
                if (!linea.isEmpty()) {
                    lineasCSV.add(linea);
                }
            }

            for (String s : lineasCSV) {
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
