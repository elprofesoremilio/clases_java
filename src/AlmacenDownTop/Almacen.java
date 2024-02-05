package AlmacenDownTop;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public int addProducto(Producto producto) {
        this.productos.add(producto);
        return 0;
    }

    public int removeProducto(Producto producto) {
        if (productos.contains(producto)) {
            productos.remove(producto);
            return 0;
        } else {
            return 1;
        }
    }
}
