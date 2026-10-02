package padroescomportamentais.state;

public class EstadoAberto extends EstadoIncidente {

    private EstadoAberto() {};
    private static EstadoAberto instance = new EstadoAberto();
    public static EstadoAberto getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aberto";
    }

    public boolean analisar(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoEmAnalise.getInstance());
        return true;
    }

    public boolean pausar(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoPausado.getInstance());
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