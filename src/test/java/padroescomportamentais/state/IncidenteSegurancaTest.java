package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IncidenteSegurancaTest {

    IncidenteSeguranca incidente;

    @BeforeEach
    public void setUp() {
        incidente = new IncidenteSeguranca();
    }

    // Incidente Aberto
    @Test
    public void deveAnalisarIncidenteAberto() {
        incidente.setEstado(EstadoAberto.getInstance());
        assertTrue(incidente.analisar());
        assertEquals(EstadoEmAnalise.getInstance(), incidente.getEstado());
    }

    @Test
    public void naoDeveConterIncidenteAberto() {
        incidente.setEstado(EstadoAberto.getInstance());
        assertFalse(incidente.conter());
    }

    @Test
    public void devePausarIncidenteAberto() {
        incidente.setEstado(EstadoAberto.getInstance());
        assertTrue(incidente.pausar());
        assertEquals(EstadoPausado.getInstance(), incidente.getEstado());
    }

    @Test
    public void deveDescartarIncidenteAberto() {
        incidente.setEstado(EstadoAberto.getInstance());
        assertTrue(incidente.descartar());
        assertEquals(EstadoDescartado.getInstance(), incidente.getEstado());
    }

    @Test
    public void naoDeveResolverIncidenteAberto() {
        incidente.setEstado(EstadoAberto.getInstance());
        assertFalse(incidente.resolver());
    }

    @Test
    public void deveEscalarIncidenteAberto() {
        incidente.setEstado(EstadoAberto.getInstance());
        assertTrue(incidente.escalar());
        assertEquals(EstadoEscalado.getInstance(), incidente.getEstado());
    }

    // Incidente em Analise
    @Test
    public void naoDeveAnalisarIncidenteEmAnalise() {
        incidente.setEstado(EstadoEmAnalise.getInstance());
        assertFalse(incidente.analisar());
    }

    @Test
    public void deveConterIncidenteEmAnalise() {
        incidente.setEstado(EstadoEmAnalise.getInstance());
        assertTrue(incidente.conter());
        assertEquals(EstadoContido.getInstance(), incidente.getEstado());
    }

    @Test
    public void devePausarIncidenteEmAnalise() {
        incidente.setEstado(EstadoEmAnalise.getInstance());
        assertTrue(incidente.pausar());
        assertEquals(EstadoPausado.getInstance(), incidente.getEstado());
    }

    @Test
    public void deveDescartarIncidenteEmAnalise() {
        incidente.setEstado(EstadoEmAnalise.getInstance());
        assertTrue(incidente.descartar());
        assertEquals(EstadoDescartado.getInstance(), incidente.getEstado());
    }

    @Test
    public void deveResolverIncidenteEmAnalise() {
        incidente.setEstado(EstadoEmAnalise.getInstance());
        assertTrue(incidente.resolver());
        assertEquals(EstadoResolvido.getInstance(), incidente.getEstado());
    }

    @Test
    public void naoDeveEscalarIncidenteEmAnalise() {
        incidente.setEstado(EstadoEmAnalise.getInstance());
        assertFalse(incidente.escalar());
    }

    // Incidente Pausado
    @Test
    public void deveAnalisarIncidentePausado() {
        incidente.setEstado(EstadoPausado.getInstance());
        assertTrue(incidente.analisar());
        assertEquals(EstadoEmAnalise.getInstance(), incidente.getEstado());
    }

    @Test
    public void naoDeveConterIncidentePausado() {
        incidente.setEstado(EstadoPausado.getInstance());
        assertFalse(incidente.conter());
    }

    @Test
    public void naoDevePausarIncidentePausado() {
        incidente.setEstado(EstadoPausado.getInstance());
        assertFalse(incidente.pausar());
    }

    @Test
    public void deveDescartarIncidentePausado() {
        incidente.setEstado(EstadoPausado.getInstance());
        assertTrue(incidente.descartar());
        assertEquals(EstadoDescartado.getInstance(), incidente.getEstado());
    }

    @Test
    public void naoDeveResolverIncidentePausado() {
        incidente.setEstado(EstadoPausado.getInstance());
        assertFalse(incidente.resolver());
    }

    @Test
    public void deveEscalarIncidentePausado() {
        incidente.setEstado(EstadoPausado.getInstance());
        assertTrue(incidente.escalar());
        assertEquals(EstadoEscalado.getInstance(), incidente.getEstado());
    }

    // Incidente Contido
    @Test
    public void naoDeveAnalisarIncidenteContido() {
        incidente.setEstado(EstadoContido.getInstance());
        assertFalse(incidente.analisar());
    }

    @Test
    public void naoDeveConterIncidenteContido() {
        incidente.setEstado(EstadoContido.getInstance());
        assertFalse(incidente.conter());
    }

    @Test
    public void naoDevePausarIncidenteContido() {
        incidente.setEstado(EstadoContido.getInstance());
        assertFalse(incidente.pausar());
    }

    @Test
    public void naoDeveDescartarIncidenteContido() {
        incidente.setEstado(EstadoContido.getInstance());
        assertFalse(incidente.descartar());
    }

    @Test
    public void deveResolverIncidenteContido() {
        incidente.setEstado(EstadoContido.getInstance());
        assertTrue(incidente.resolver());
        assertEquals(EstadoResolvido.getInstance(), incidente.getEstado());
    }

    @Test
    public void naoDeveEscalarIncidenteContido() {
        incidente.setEstado(EstadoContido.getInstance());
        assertFalse(incidente.escalar());
    }

    // Incidente Descartado
    @Test
    public void naoDeveAnalisarIncidenteDescartado() {
        incidente.setEstado(EstadoDescartado.getInstance());
        assertFalse(incidente.analisar());
    }

    @Test
    public void naoDeveConterIncidenteDescartado() {
        incidente.setEstado(EstadoDescartado.getInstance());
        assertFalse(incidente.conter());
    }

    @Test
    public void naoDevePausarIncidenteDescartado() {
        incidente.setEstado(EstadoDescartado.getInstance());
        assertFalse(incidente.pausar());
    }

    @Test
    public void naoDeveDescartarIncidenteDescartado() {
        incidente.setEstado(EstadoDescartado.getInstance());
        assertFalse(incidente.descartar());
    }

    @Test
    public void naoDeveResolverIncidenteDescartado() {
        incidente.setEstado(EstadoDescartado.getInstance());
        assertFalse(incidente.resolver());
    }

    @Test
    public void naoDeveEscalarIncidenteDescartado() {
        incidente.setEstado(EstadoDescartado.getInstance());
        assertFalse(incidente.escalar());
    }

    // Incidente Resolvido
    @Test
    public void naoDeveAnalisarIncidenteResolvido() {
        incidente.setEstado(EstadoResolvido.getInstance());
        assertFalse(incidente.analisar());
    }

    @Test
    public void naoDeveConterIncidenteResolvido() {
        incidente.setEstado(EstadoResolvido.getInstance());
        assertFalse(incidente.conter());
    }

    @Test
    public void naoDevePausarIncidenteResolvido() {
        incidente.setEstado(EstadoResolvido.getInstance());
        assertFalse(incidente.pausar());
    }

    @Test
    public void deveDescartarIncidenteResolvido() {
        incidente.setEstado(EstadoResolvido.getInstance());
        assertTrue(incidente.descartar());
        assertEquals(EstadoDescartado.getInstance(), incidente.getEstado());
    }

    @Test
    public void naoDeveResolverIncidenteResolvido() {
        incidente.setEstado(EstadoResolvido.getInstance());
        assertFalse(incidente.resolver());
    }

    @Test
    public void naoDeveEscalarIncidenteResolvido() {
        incidente.setEstado(EstadoResolvido.getInstance());
        assertFalse(incidente.escalar());
    }

    // Incidente Escalado
    @Test
    public void naoDeveAnalisarIncidenteEscalado() {
        incidente.setEstado(EstadoEscalado.getInstance());
        assertFalse(incidente.analisar());
    }

    @Test
    public void naoDeveConterIncidenteEscalado() {
        incidente.setEstado(EstadoEscalado.getInstance());
        assertFalse(incidente.conter());
    }

    @Test
    public void naoDevePausarIncidenteEscalado() {
        incidente.setEstado(EstadoEscalado.getInstance());
        assertFalse(incidente.pausar());
    }

    @Test
    public void naoDeveDescartarIncidenteEscalado() {
        incidente.setEstado(EstadoEscalado.getInstance());
        assertFalse(incidente.descartar());
    }

    @Test
    public void deveResolverIncidenteEscalado() {
        incidente.setEstado(EstadoEscalado.getInstance());
        assertTrue(incidente.resolver());
        assertEquals(EstadoResolvido.getInstance(), incidente.getEstado());
    }

    @Test
    public void naoDeveEscalarIncidenteEscalado() {
        incidente.setEstado(EstadoEscalado.getInstance());
        assertFalse(incidente.escalar());
    }
}