package EjerciciosConClases.Gusanos;

import java.util.LinkedList;
import java.util.List;

public class Gusano {
    private List<Anillo> anillos;

    public Gusano(String cuerpo) {
        anillos = new LinkedList<>();
        for (int i = 0; i < cuerpo.length(); i++) {
            anillos.add(new Anillo(cuerpo.charAt(i)));
        }
    }
    public void duplicar() {
        LinkedList<Anillo> nuevos = new LinkedList<>();

        for (Anillo anillo : anillos) {
            Anillo nuevoAnillo = anillo.duplicar();
            if (nuevoAnillo != null) {
                nuevos.add(nuevoAnillo);
            }
        }

        int posicion = 1;
        int numeroAnillos = anillos.size()-1;
        for (int i = 0; i < numeroAnillos; i++) {
            anillos.add(posicion,nuevos.remove(0));
            posicion += 2;
        }
    }

    public void duplicar(int veces) {
        for (int i = 0; i < veces; i++) {
            this.duplicar();
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Anillo anillo : anillos) {
            result.append(anillo.toString());
        }

        return result.toString();
    }
}
