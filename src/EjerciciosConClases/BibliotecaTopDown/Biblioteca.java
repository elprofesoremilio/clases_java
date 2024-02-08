package EjerciciosConClases.BibliotecaTopDown;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    List<Libro> libros = new LinkedList<>();
    public boolean addLibro(String titulo) {
        libros.add(new Libro(titulo));
        return true;
    }

    public int size() {
        return libros.size();
    }

    public String getTituloLibro(int i) {
        return libros.get(i).getTitulo();
    }

    public boolean remove(String titulo) {
        int indice = indexOf(titulo);

        if (indice!=-1) {
            libros.remove(indice);
            return true;
        } else {
            return false;
        }
    }

    public int indexOf(String titulo) {
        int indice = -1;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                indice = i;
                break;
            }
        }
        return indice;
    }

    public boolean contains(String titulo) {
        return indexOf(titulo) != -1;
    }

    public boolean update(String titulo, String nuevoTitulo) {
        int index = indexOf(titulo);
        if (index==-1) return false;
        libros.get(index).setTitulo(nuevoTitulo);
        return true;
    }
}
