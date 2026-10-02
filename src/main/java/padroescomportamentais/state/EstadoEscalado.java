package padroescomportamentais.state;

public class EstadoEscalado extends EstadoIncidente {

    private EstadoEscalado() {};
    private static EstadoEscalado instance = new EstadoEscalado();
    public static EstadoEscalado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Escalado";
    }

    public boolean resolver(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoResolvido.getInstance());
        return true;
    }
}