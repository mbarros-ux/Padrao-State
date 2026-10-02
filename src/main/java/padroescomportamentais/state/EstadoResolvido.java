package padroescomportamentais.state;

public class EstadoResolvido extends EstadoIncidente {

    private EstadoResolvido() {};
    private static EstadoResolvido instance = new EstadoResolvido();
    public static EstadoResolvido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Resolvido";
    }

    public boolean descartar(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoDescartado.getInstance());
        return true;
    }
}