package Archivos;

import java.io.*;

public class EscribirArchivoTexto {
    public static void EscribirConPrintWriter () {
        PrintWriter pw = null;

        try {
            //pw = new PrintWriter(Constants.NOMBRE_ARCHIVO_ESCRITURA);
            pw = new PrintWriter(new FileOutputStream(Config.NOMBRE_ARCHIVO_ESCRITURA,true));

            pw.println("Primera linea.");
            pw.println("Segunda linea.");
            pw.println("Tercera linea.");
            pw.println("Cuarta linea.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (pw!=null) pw.close();
        }
    }
    public static void main(String[] args) {
        EscribirConBufferedWriter();
    }

    private static void EscribirConBufferedWriter() {
        FileWriter fw = null;
        BufferedWriter bw = null;

        String linea;

        try {
            fw = new FileWriter(Config.NOMBRE_ARCHIVO_ESCRITURA);
            bw = new BufferedWriter(fw);

            bw.write("todo lo que quiera");
            bw.write("todo lo que quiera otra vez");
            bw.newLine();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Fallo al escribir");
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("No se pudo cerrar el buffer");
                }
            }
            if (fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("No se pudo cerrar el archivo");
                }
            }
        }        
    }
}
