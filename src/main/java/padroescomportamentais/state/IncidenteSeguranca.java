package padroescomportamentais.state;

public class IncidenteSeguranca {

    private String descricao;
    private EstadoIncidente estado;

    public IncidenteSeguranca() {
        this.estado = EstadoAberto.getInstance();
    }

    public void setEstado(EstadoIncidente estado) {
        this.estado = estado;
    }

    public boolean analisar() {
        return estado.analisar(this);
    }

    public boolean conter() {
        return estado.conter(this);
    }

    public boolean pausar() {
        return estado.pausar(this);
    }

    public boolean descartar() {
        return estado.descartar(this);
    }

    public boolean resolver() {
        return estado.resolver(this);
    }

    public boolean escalar() {
        return estado.escalar(this);
    }

    public String getNomeEstado() {
        return estado.getNomeEstado();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EstadoIncidente getEstado() {
        return estado;
    }
}