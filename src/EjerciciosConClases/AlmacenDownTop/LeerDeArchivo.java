package EjerciciosConClases.AlmacenDownTop;

public class LeerDeArchivo {

    public static void main(String[] args) {
        String cadena = "patata 1.1 100";

        StringBuilder nombre= new StringBuilder();
        float precio;
        int existencias;

        int i=0;
        while (cadena.charAt(i)!=' ') {
            nombre.append(cadena.charAt(i));
            i++;
        }

        i++;
        StringBuilder resto= new StringBuilder();

        while (cadena.charAt(i)!=' ') {
            resto.append(cadena.charAt(i));
            i++;
        }

        i++;
        precio = Float.parseFloat(resto.toString());
        resto = new StringBuilder();

        for (; i<cadena.length(); i++) {
            resto.append(cadena.charAt(i));
        }

        existencias = Integer.parseInt(resto.toString());
        Producto p = new Producto(nombre.toString(), precio, existencias);
        System.out.println(p);
    }
}
