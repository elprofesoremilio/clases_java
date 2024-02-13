package EjerciciosConClases.AlmacenDownTop;

import Archivos.Constants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscribirAArchivo {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        almacen.estanteria.add(new Producto("Patata bolsa 5kg",1.2f,10));
        almacen.estanteria.add(new Producto("Pan 1kg",4f,30));
        almacen.estanteria.add(new Producto("Agua mineral 2L",0.7f,50));
        almacen.estanteria.add(new Producto("Cangrejo",10.2f,5));

        ArrayList<String> lineasCsv = new ArrayList<>();

        for (Producto producto : almacen.estanteria) {
            lineasCsv.add(
                    producto.getNombre() + "," + producto.getPrecio() + "," + producto.getExistencias()
            );
        }

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(Constants.NOMBRE_ARCHIVO_ESCRITURA);
            bw = new BufferedWriter(fw);

/*
            for (int i = 0; i < lineasCsv.size(); i++) {
                bw.write(lineasCsv.get(i));
                if (i<lineasCsv.size()-1) {
                    bw.newLine();
                }
            }
*/
            for (String linea : lineasCsv) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir archivo.");
        } finally {
            if (bw!=null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar búffer");
                }
            }
            if (fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar archivo");
                }
            }
        }
    }
}
