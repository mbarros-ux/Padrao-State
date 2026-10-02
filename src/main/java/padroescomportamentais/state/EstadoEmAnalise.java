package padroescomportamentais.state;

public class EstadoEmAnalise extends EstadoIncidente {

    private EstadoEmAnalise() {};
    private static EstadoEmAnalise instance = new EstadoEmAnalise();
    public static EstadoEmAnalise getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Análise";
    }

    public boolean conter(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoContido.getInstance());
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

    public boolean resolver(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoResolvido.getInstance());
        return true;
    }
}