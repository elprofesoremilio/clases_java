package EjerciciosConClases.Gusanos;

public class Anillo {
    public static final char AMARILLO = 'A';
    public static final char NEGRO = 'N';
    public static final char CABEZA = 'C';
    private final char tipo;

    public Anillo(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public Anillo duplicar() {
        switch (tipo) {
            case AMARILLO:
                return new Anillo(NEGRO);
            case NEGRO:
                return new Anillo(AMARILLO);
            default:
                return null;
        }
    }
    @Override
    public String toString() {
        return Character.toString(tipo);
    }
}
