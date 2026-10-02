package padroescomportamentais.state;

public abstract class EstadoIncidente {

    public abstract String getNomeEstado();

    public boolean analisar(IncidenteSeguranca incidente) {
        return false;
    }

    public boolean conter(IncidenteSeguranca incidente) {
        return false;
    }

    public boolean pausar(IncidenteSeguranca incidente) {
        return false;
    }

    public boolean descartar(IncidenteSeguranca incidente) {
        return false;
    }

    public boolean resolver(IncidenteSeguranca incidente) {
        return false;
    }

    public boolean escalar(IncidenteSeguranca incidente) {
        return false;
    }
}