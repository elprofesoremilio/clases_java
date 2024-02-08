package EjerciciosConClases.AlmacenDownTop;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    public List<Producto> estanteria;

    public Almacen() {
        estanteria = new ArrayList<>();
    }

    public int add(Producto producto) {
        this.estanteria.add(producto);
        return 0;
    }

    public int remove(Producto producto) {
        if (estanteria.contains(producto)) {
            estanteria.remove(producto);
            return 0;
        } else {
            return 1;
        }
    }
    public int set(Producto actual, Producto nuevo) {
        if (estanteria.contains(actual)) {
            actual.copy(nuevo);
            return 0;
        } else {
            return 1;
        }
    }

    public Producto get(String nombre) {
        for (Producto producto : estanteria) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }
    public Producto get(int index) {
        return estanteria.get(index);
    }
    public int size() {
        return estanteria.size();
    }
}
