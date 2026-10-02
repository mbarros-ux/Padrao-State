package padroescomportamentais.state;

public class EstadoDescartado extends EstadoIncidente {

    private EstadoDescartado() {};
    private static EstadoDescartado instance = new EstadoDescartado();
    public static EstadoDescartado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Descartado";
    }
}