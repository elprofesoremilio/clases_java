package EjerciciosConClases.AlmacenDownTop;

import java.io.*;

public class GestionCSV {
    public static boolean escribirAlmacen(String ruta, Almacen almacen) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        boolean correcto = false;

        if (almacen==null || almacen.size()<1) {
            return false;
        }

        try {
            fw = new FileWriter(ruta);
            bw = new BufferedWriter(fw);

//            bw.write("Nombre,Precio,Existencias");
//            bw.newLine();
            for (Producto producto : almacen.estanteria) {
                bw.write(producto.toCSV());
                bw.newLine();
            }
            correcto = true;
        } catch (IOException e) {
            correcto = false;
        } finally {
            if (bw!=null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    correcto = false;
                }
            }
            if (fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    correcto = false;
                }
            }
        }
        return correcto;
    }

    public static Almacen cargarAlmacen(String ruta) {
        FileReader fr = null;
        BufferedReader br = null;

        Almacen almacen = new Almacen();

        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine())!= null) {
                if (!linea.isEmpty()) {
                    almacen.add(Producto.from(linea));
                }
            }

        } catch (FileNotFoundException e) {
            almacen = null;
        } catch (IOException e) {
            almacen = null;
        } finally {
            if (br!=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return almacen;
    }
}
