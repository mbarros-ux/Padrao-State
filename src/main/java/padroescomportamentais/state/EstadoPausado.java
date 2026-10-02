package padroescomportamentais.state;

public class EstadoPausado extends EstadoIncidente {

    private EstadoPausado() {};
    private static EstadoPausado instance = new EstadoPausado();
    public static EstadoPausado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pausado";
    }

    public boolean analisar(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoEmAnalise.getInstance());
        return true;
    }

    public boolean descartar(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoDescartado.getInstance());
        return true;
    }

    public boolean escalar(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoEscalado.getInstance());
        return true;
    }
}