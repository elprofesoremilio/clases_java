package EjerciciosConClases.BibliotecaTopDown;

public class Libro {
    private String titulo;
    private int anio;

    public Libro(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public static Libro from(String linea) {
        String[] datos = linea.split(",");
        return new Libro(datos[0], Integer.parseInt(datos[1].trim()));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Titulo: '" + titulo + "\'\n" +
        "Año de publicación: " + anio;
    }

    public String toCSV() {
        return this.titulo + "," + this.anio;
    }
}
