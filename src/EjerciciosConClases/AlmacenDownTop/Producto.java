package EjerciciosConClases.AlmacenDownTop;

/**
 * @author Emilio
 * La clase producto es una clase Modelo deltro del MVC.
 */
public class Producto {
    private final int id;
    private String nombre;
    private float precio;
    private int existencias;
    private static int contador=0;

    /**
     * Constructor que autoasigna el ID del producto de forma incremental.
     * @param nombre String con el nombre del producto
     * @param precio float que contendrá el precio
     * @param existencias int que contendrá la cantidad de productos en existencias
     */
    public Producto(String nombre, float precio, int existencias) {
        this.id = contador;
        contador++;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }

    /**
     * Método para crear un producto desde una <strong>String</strong> que contiene el producto en formato CSV
     * @param linea String con el producto en CSV
     * @param separador String que contiene el separador usado en la <em>línea</em>
     * @return Producto obtenido a partir del contenido de <em>línea</em>
     */
    public static Producto from(String linea, String separador) {
        String[] datos = linea.split(separador);
        return new Producto(datos[0],Float.parseFloat(datos[1]),Integer.parseInt(datos[2]));
    }
    /**
     * Método para crear un producto desde una <strong>String</strong> que contiene el producto en formato CSV
     * y por defecto usando el separador ','
     * @param linea String con el producto en CSV
     * @return Producto obtenido a partir del contenido de <em>línea</em>
     */
    public static Producto from(String linea) {
        return from(linea,",");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getExistencias() {
        return existencias;
    }
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    public int getId() {
        return id;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", existencias=" + existencias +
                '}';
    }

    /**
     * Añade existencias a un producto
     * @param cantidad cantidad de existencias a sumar
     */
    public void addExistencias(int cantidad) {
        this.existencias+=cantidad;
    }

    /**
     * Copia los datos de un producto dado en el actual (this)
     * @param producto el producto desde el que vamos a copiar
     */
    public void copy(Producto producto) {
        this.nombre = producto.nombre;
        this.precio = producto.precio;
        this.existencias = producto.existencias;
    }

    /**
     * Resta al producto la cantidad de existencias indicadas.
     * OJO, puede resultar en existencias negativas.
     * @param cantidad existencias a borrar
     */
    public void removeExistencias(int cantidad) {
        this.existencias -= cantidad;
    }

    public String toCSV() {
        return toCSV(",");
    }
    public String toCSV(String separator) {
        return nombre+separator+precio+separator+existencias;
    }
}
