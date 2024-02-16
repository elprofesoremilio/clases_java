package EjerciciosConClases.BibliotecaTopDown;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class GestionCSV {
    public static List<String> leerArchivoCSV(String ruta) {
        BufferedReader br = null;
        FileReader fr = null;
        LinkedList<String> datos = null;
        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            datos = new LinkedList<>();
            String linea;
            while ((linea=br.readLine())!=null) {
                datos.add(linea);
            }

        } catch (IOException e) {
            System.out.println("Error de lectura.");
        } finally {
            try {
                if (br!=null) {
                    br.close();
                }
                if (fr!=null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }

        }
        return datos;
    }

    public static boolean guardarArchivoCSV(String ruta, List<String> datos) {
        FileWriter fr = null;
        BufferedWriter br = null;
        boolean result = false;
        try {
            fr = new FileWriter(ruta);
            br = new BufferedWriter(fr);

            for (String linea : datos) {
                br.write(linea);
                br.newLine();
            }

            result = true;
        } catch (IOException e) {
            System.out.println("Error al escribir");
        } finally {
            try {
                if (br!=null) {
                    br.close();
                }
                if (fr!=null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        return result;
    }
}
