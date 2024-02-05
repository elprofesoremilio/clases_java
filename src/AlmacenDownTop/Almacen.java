package AlmacenDownTop;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public int add(Producto producto) {
        this.productos.add(producto);
        return 0;
    }

    public int remove(Producto producto) {
        if (productos.contains(producto)) {
            productos.remove(producto);
            return 0;
        } else {
            return 1;
        }
    }
    public int set(Producto actual, Producto nuevo) {
        if (productos.contains(actual)) {
            actual.copy(nuevo);
            return 0;
        } else {
            return 1;
        }
    }

    public Producto get(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }
    public Producto get(int index) {
        return productos.get(index);
    }
    public int size() {
        return productos.size();
    }
}
