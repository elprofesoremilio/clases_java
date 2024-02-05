package AlmacenDownTop;

public class Producto {
    private int id;
    private String nombre;
    private float precio;
    private int existencias;
    private static int contador=0;

    public Producto(String nombre, float precio, int existencias) {
        this.id = contador;
        contador++;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
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

    public void copy(Producto producto) {
        this.nombre = producto.nombre;
        this.precio = producto.precio;
        this.existencias = producto.existencias;
    }
}
