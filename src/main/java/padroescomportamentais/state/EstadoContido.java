package padroescomportamentais.state;

public class EstadoContido extends EstadoIncidente {

    private EstadoContido() {};
    private static EstadoContido instance = new EstadoContido();
    public static EstadoContido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Contido";
    }

    public boolean resolver(IncidenteSeguranca incidente) {
        incidente.setEstado(EstadoResolvido.getInstance());
        return true;
    }
}